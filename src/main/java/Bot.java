import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    // processing received messages
    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId()); // who writes?

        if (update.getMessage().getText().equals("Salute!")) {
            sendMessage.setText("ARRRRRRRRRRRRRRRR"); // set new message
            try {
                execute(sendMessage); // sending message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }


    // bot name 4 telegram server
    public String getBotUsername() {
        return "@anabiozzze_bot";
    }

    // bot token 4 telegram server
    public String getBotToken() {
        return "1032392272:AAHWSg_chn6IMB5HrOfmNvswA1mWbb56YRI";
    }


}
