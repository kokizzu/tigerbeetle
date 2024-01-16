//////////////////////////////////////////////////////////
// This file was auto-generated by java_bindings.zig
// Do not manually modify.
//////////////////////////////////////////////////////////

package com.tigerbeetle;

import java.nio.ByteBuffer;
import java.math.BigInteger;

public final class AccountBatch extends Batch {

    interface Struct {
        int SIZE = 128;

        int Id = 0;
        int DebitsPending = 16;
        int DebitsPosted = 32;
        int CreditsPending = 48;
        int CreditsPosted = 64;
        int UserData128 = 80;
        int UserData64 = 96;
        int UserData32 = 104;
        int Reserved = 108;
        int Ledger = 112;
        int Code = 116;
        int Flags = 118;
        int Timestamp = 120;
    }

    static final AccountBatch EMPTY = new AccountBatch(0);

    /**
     * Creates an empty batch with the desired maximum capacity.
     * <p>
     * Once created, an instance cannot be resized, however it may contain any number of elements
     * between zero and its {@link #getCapacity capacity}.
     *
     * @param capacity the maximum capacity.
     * @throws IllegalArgumentException if capacity is negative.
     */
    public AccountBatch(final int capacity) {
        super(capacity, Struct.SIZE);
    }

    AccountBatch(final ByteBuffer buffer) {
        super(buffer, Struct.SIZE);
    }

    /**
     * @return an array of 16 bytes representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#id">id</a>
     */
    public byte[] getId() {
        return getUInt128(at(Struct.Id));
    }

    /**
     * @param part a {@link UInt128} enum indicating which part of the 128-bit value is to be retrieved.
     * @return a {@code long} representing the first 8 bytes of the 128-bit value if
     *         {@link UInt128#LeastSignificant} is informed, or the last 8 bytes if
     *         {@link UInt128#MostSignificant}.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#id">id</a>
     */
    public long getId(final UInt128 part) {
        return getUInt128(at(Struct.Id), part);
    }

    /**
     * @param id an array of 16 bytes representing the 128-bit value.
     * @throws IllegalArgumentException if {@code id} is not 16 bytes long.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#id">id</a>
     */
    public void setId(final byte[] id) {
        putUInt128(at(Struct.Id), id);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @param mostSignificant a {@code long} representing the last 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#id">id</a>
     */
    public void setId(final long leastSignificant, final long mostSignificant) {
        putUInt128(at(Struct.Id), leastSignificant, mostSignificant);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#id">id</a>
     */
    public void setId(final long leastSignificant) {
        putUInt128(at(Struct.Id), leastSignificant, 0);
    }

    /**
     * @return a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_pending">debits_pending</a>
     */
    public BigInteger getDebitsPending() {
        final var index = at(Struct.DebitsPending);
        return UInt128.asBigInteger(
            getUInt128(index, UInt128.LeastSignificant), 
            getUInt128(index, UInt128.MostSignificant));
    }

    /**
     * @param part a {@link UInt128} enum indicating which part of the 128-bit value is to be retrieved.
     * @return a {@code long} representing the first 8 bytes of the 128-bit value if
     *         {@link UInt128#LeastSignificant} is informed, or the last 8 bytes if
     *         {@link UInt128#MostSignificant}.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_pending">debits_pending</a>
     */
    public long getDebitsPending(final UInt128 part) {
        return getUInt128(at(Struct.DebitsPending), part);
    }

    /**
     * @param debitsPending a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_pending">debits_pending</a>
     */
    void setDebitsPending(final BigInteger debitsPending) {
        putUInt128(at(Struct.DebitsPending), UInt128.asBytes(debitsPending));
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @param mostSignificant a {@code long} representing the last 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_pending">debits_pending</a>
     */
    void setDebitsPending(final long leastSignificant, final long mostSignificant) {
        putUInt128(at(Struct.DebitsPending), leastSignificant, mostSignificant);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_pending">debits_pending</a>
     */
    void setDebitsPending(final long leastSignificant) {
        putUInt128(at(Struct.DebitsPending), leastSignificant, 0);
    }

    /**
     * @return a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_posted">debits_posted</a>
     */
    public BigInteger getDebitsPosted() {
        final var index = at(Struct.DebitsPosted);
        return UInt128.asBigInteger(
            getUInt128(index, UInt128.LeastSignificant), 
            getUInt128(index, UInt128.MostSignificant));
    }

    /**
     * @param part a {@link UInt128} enum indicating which part of the 128-bit value is to be retrieved.
     * @return a {@code long} representing the first 8 bytes of the 128-bit value if
     *         {@link UInt128#LeastSignificant} is informed, or the last 8 bytes if
     *         {@link UInt128#MostSignificant}.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_posted">debits_posted</a>
     */
    public long getDebitsPosted(final UInt128 part) {
        return getUInt128(at(Struct.DebitsPosted), part);
    }

    /**
     * @param debitsPosted a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_posted">debits_posted</a>
     */
    void setDebitsPosted(final BigInteger debitsPosted) {
        putUInt128(at(Struct.DebitsPosted), UInt128.asBytes(debitsPosted));
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @param mostSignificant a {@code long} representing the last 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_posted">debits_posted</a>
     */
    void setDebitsPosted(final long leastSignificant, final long mostSignificant) {
        putUInt128(at(Struct.DebitsPosted), leastSignificant, mostSignificant);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#debits_posted">debits_posted</a>
     */
    void setDebitsPosted(final long leastSignificant) {
        putUInt128(at(Struct.DebitsPosted), leastSignificant, 0);
    }

    /**
     * @return a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_pending">credits_pending</a>
     */
    public BigInteger getCreditsPending() {
        final var index = at(Struct.CreditsPending);
        return UInt128.asBigInteger(
            getUInt128(index, UInt128.LeastSignificant), 
            getUInt128(index, UInt128.MostSignificant));
    }

    /**
     * @param part a {@link UInt128} enum indicating which part of the 128-bit value is to be retrieved.
     * @return a {@code long} representing the first 8 bytes of the 128-bit value if
     *         {@link UInt128#LeastSignificant} is informed, or the last 8 bytes if
     *         {@link UInt128#MostSignificant}.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_pending">credits_pending</a>
     */
    public long getCreditsPending(final UInt128 part) {
        return getUInt128(at(Struct.CreditsPending), part);
    }

    /**
     * @param creditsPending a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_pending">credits_pending</a>
     */
    void setCreditsPending(final BigInteger creditsPending) {
        putUInt128(at(Struct.CreditsPending), UInt128.asBytes(creditsPending));
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @param mostSignificant a {@code long} representing the last 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_pending">credits_pending</a>
     */
    void setCreditsPending(final long leastSignificant, final long mostSignificant) {
        putUInt128(at(Struct.CreditsPending), leastSignificant, mostSignificant);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_pending">credits_pending</a>
     */
    void setCreditsPending(final long leastSignificant) {
        putUInt128(at(Struct.CreditsPending), leastSignificant, 0);
    }

    /**
     * @return a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_posted">credits_posted</a>
     */
    public BigInteger getCreditsPosted() {
        final var index = at(Struct.CreditsPosted);
        return UInt128.asBigInteger(
            getUInt128(index, UInt128.LeastSignificant), 
            getUInt128(index, UInt128.MostSignificant));
    }

    /**
     * @param part a {@link UInt128} enum indicating which part of the 128-bit value is to be retrieved.
     * @return a {@code long} representing the first 8 bytes of the 128-bit value if
     *         {@link UInt128#LeastSignificant} is informed, or the last 8 bytes if
     *         {@link UInt128#MostSignificant}.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_posted">credits_posted</a>
     */
    public long getCreditsPosted(final UInt128 part) {
        return getUInt128(at(Struct.CreditsPosted), part);
    }

    /**
     * @param creditsPosted a {@link java.math.BigInteger} representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_posted">credits_posted</a>
     */
    void setCreditsPosted(final BigInteger creditsPosted) {
        putUInt128(at(Struct.CreditsPosted), UInt128.asBytes(creditsPosted));
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @param mostSignificant a {@code long} representing the last 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_posted">credits_posted</a>
     */
    void setCreditsPosted(final long leastSignificant, final long mostSignificant) {
        putUInt128(at(Struct.CreditsPosted), leastSignificant, mostSignificant);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#credits_posted">credits_posted</a>
     */
    void setCreditsPosted(final long leastSignificant) {
        putUInt128(at(Struct.CreditsPosted), leastSignificant, 0);
    }

    /**
     * @return an array of 16 bytes representing the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_128">user_data_128</a>
     */
    public byte[] getUserData128() {
        return getUInt128(at(Struct.UserData128));
    }

    /**
     * @param part a {@link UInt128} enum indicating which part of the 128-bit value is to be retrieved.
     * @return a {@code long} representing the first 8 bytes of the 128-bit value if
     *         {@link UInt128#LeastSignificant} is informed, or the last 8 bytes if
     *         {@link UInt128#MostSignificant}.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_128">user_data_128</a>
     */
    public long getUserData128(final UInt128 part) {
        return getUInt128(at(Struct.UserData128), part);
    }

    /**
     * @param userData128 an array of 16 bytes representing the 128-bit value.
     * @throws IllegalArgumentException if {@code userData128} is not 16 bytes long.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_128">user_data_128</a>
     */
    public void setUserData128(final byte[] userData128) {
        putUInt128(at(Struct.UserData128), userData128);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @param mostSignificant a {@code long} representing the last 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_128">user_data_128</a>
     */
    public void setUserData128(final long leastSignificant, final long mostSignificant) {
        putUInt128(at(Struct.UserData128), leastSignificant, mostSignificant);
    }

    /**
     * @param leastSignificant a {@code long} representing the first 8 bytes of the 128-bit value.
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_128">user_data_128</a>
     */
    public void setUserData128(final long leastSignificant) {
        putUInt128(at(Struct.UserData128), leastSignificant, 0);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_64">user_data_64</a>
     */
    public long getUserData64() {
        final var value = getUInt64(at(Struct.UserData64));
        return value;
    }

    /**
     * @param userData64
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_64">user_data_64</a>
     */
    public void setUserData64(final long userData64) {
        putUInt64(at(Struct.UserData64), userData64);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_32">user_data_32</a>
     */
    public int getUserData32() {
        final var value = getUInt32(at(Struct.UserData32));
        return value;
    }

    /**
     * @param userData32
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#user_data_32">user_data_32</a>
     */
    public void setUserData32(final int userData32) {
        putUInt32(at(Struct.UserData32), userData32);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#reserved">reserved</a>
     */
    int getReserved() {
        final var value = getUInt32(at(Struct.Reserved));
        return value;
    }

    /**
     * @param reserved
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#reserved">reserved</a>
     */
    void setReserved(final int reserved) {
        putUInt32(at(Struct.Reserved), reserved);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#ledger">ledger</a>
     */
    public int getLedger() {
        final var value = getUInt32(at(Struct.Ledger));
        return value;
    }

    /**
     * @param ledger
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#ledger">ledger</a>
     */
    public void setLedger(final int ledger) {
        putUInt32(at(Struct.Ledger), ledger);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#code">code</a>
     */
    public int getCode() {
        final var value = getUInt16(at(Struct.Code));
        return value;
    }

    /**
     * @param code
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#code">code</a>
     */
    public void setCode(final int code) {
        putUInt16(at(Struct.Code), code);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#flags">flags</a>
     */
    public int getFlags() {
        final var value = getUInt16(at(Struct.Flags));
        return value;
    }

    /**
     * @param flags
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#flags">flags</a>
     */
    public void setFlags(final int flags) {
        putUInt16(at(Struct.Flags), flags);
    }

    /**
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#timestamp">timestamp</a>
     */
    public long getTimestamp() {
        final var value = getUInt64(at(Struct.Timestamp));
        return value;
    }

    /**
     * @param timestamp
     * @throws IllegalStateException if not at a {@link #isValidPosition valid position}.
     * @throws IllegalStateException if a {@link #isReadOnly() read-only} batch.
     * @see <a href="https://docs.tigerbeetle.com/reference/accounts/#timestamp">timestamp</a>
     */
    void setTimestamp(final long timestamp) {
        putUInt64(at(Struct.Timestamp), timestamp);
    }

}

