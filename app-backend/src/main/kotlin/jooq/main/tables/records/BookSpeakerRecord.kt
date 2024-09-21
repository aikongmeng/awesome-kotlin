/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.records


import jooq.main.tables.BookSpeaker

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookSpeakerRecord() : UpdatableRecordImpl<BookSpeakerRecord>(BookSpeaker.BOOK_SPEAKER) {

    open var bookId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var kotlinerId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Long?> = super.key() as Record2<Long?, Long?>

    /**
     * Create a detached, initialised BookSpeakerRecord
     */
    constructor(bookId: Long? = null, kotlinerId: Long? = null): this() {
        this.bookId = bookId
        this.kotlinerId = kotlinerId
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised BookSpeakerRecord
     */
    constructor(value: jooq.main.tables.pojos.BookSpeaker?): this() {
        if (value != null) {
            this.bookId = value.bookId
            this.kotlinerId = value.kotlinerId
            resetChangedOnNotNull()
        }
    }
}
