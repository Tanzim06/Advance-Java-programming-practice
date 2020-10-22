package Chapter02.program.EmailSender;

@FunctionalInterface
public interface MassageTranslator {
	String translate(String msg);
}
