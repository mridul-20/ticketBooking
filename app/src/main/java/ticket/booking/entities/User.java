package ticket.booking.entities;

import sun.security.krb5.internal.Ticket;

import java.util.List;

public class User {
    private String name;

    private String password;

    private String hashPassword;

    private List<Ticket> ticketsBooked;

    private String userId;
}
