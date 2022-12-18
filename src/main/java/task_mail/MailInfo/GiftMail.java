package task_mail.MailInfo;

public class GiftMail implements MailCode{
    private static final String TEMPLATE = "Dear, %NAME! SAINT NICHOLAS DAY IS COMING! GREATEST DISCOUNTS EVER UP TO 75%! GET YOUR FIRST DISCOUNT 30%";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
