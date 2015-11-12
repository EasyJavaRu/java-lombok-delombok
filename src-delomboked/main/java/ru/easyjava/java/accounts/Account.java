// Generated by delombok at Mon Nov 09 13:30:44 EET 2015
package ru.easyjava.java.accounts;

import lombok.NonNull;
import ru.easyjava.java.users.User;
import java.math.BigDecimal;

/**
 * Sample account entity.
 */
public class Account {
    
    /**
     * Id.
     */
    @NonNull
    Long id;
    
    /**
     * Account owner.
     */
    @NonNull
    User owner;
    
    /**
     * Account's value.
     */
    BigDecimal amount;

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private Account(@NonNull final Long id, @NonNull final User owner) {
        if (id == null) {
            throw new java.lang.NullPointerException("id");
        }
        if (owner == null) {
            throw new java.lang.NullPointerException("owner");
        }
        this.id = id;
        this.owner = owner;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static Account create(@NonNull final Long id, @NonNull final User owner) {
        return new Account(id, owner);
    }

    /**
     * Id.
     */
    @NonNull
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Long getId() {
        return this.id;
    }

    /**
     * Account owner.
     */
    @NonNull
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public User getOwner() {
        return this.owner;
    }

    /**
     * Account's value.
     */
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Id.
     */
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public void setId(@NonNull final Long id) {
        if (id == null) {
            throw new java.lang.NullPointerException("id");
        }
        this.id = id;
    }

    /**
     * Account owner.
     */
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public void setOwner(@NonNull final User owner) {
        if (owner == null) {
            throw new java.lang.NullPointerException("owner");
        }
        this.owner = owner;
    }

    /**
     * Account's value.
     */
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Account)) return false;
        final Account other = (Account)o;
        if (!other.canEqual((java.lang.Object)this)) return false;
        final java.lang.Object this$id = this.getId();
        final java.lang.Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final java.lang.Object this$owner = this.getOwner();
        final java.lang.Object other$owner = other.getOwner();
        if (this$owner == null ? other$owner != null : !this$owner.equals(other$owner)) return false;
        final java.lang.Object this$amount = this.getAmount();
        final java.lang.Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Account;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final java.lang.Object $owner = this.getOwner();
        result = result * PRIME + ($owner == null ? 43 : $owner.hashCode());
        final java.lang.Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
        return "Account(id=" + this.getId() + ", owner=" + this.getOwner() + ", amount=" + this.getAmount() + ")";
    }
}