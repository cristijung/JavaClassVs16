package JavaClass.parteIII.aula07.javaTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankTransaction {
    private String transactionId;
    private double amount;
    private LocalDateTime transactionTime;

    public BankTransaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionTime = LocalDateTime.now(); //registrando a data e hora atual da transação ...
    }

    public void printTransactionDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTransactionTime = transactionTime.format(formatter);
        System.out.println("Transação ID: " + transactionId);
        System.out.println("Montante: R$" + amount);
        System.out.println("Data e Hora da Transação: " + formattedTransactionTime);
    }

    public void printElapsedTimeSinceTransaction() {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(transactionTime, now);
        long seconds = duration.getSeconds();
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.println("Tempo decorrido desde a transação: " + hours + " horas, " + minutes + " minutos, e " + seconds + " segundos.");
    }

    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction("TX123456", 2500.00);
        transaction.printTransactionDetails();

        //simulação de uma espera de alguns segundos
        try {
            Thread.sleep(5000); //espera por 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        transaction.printElapsedTimeSinceTransaction();
    }
}

