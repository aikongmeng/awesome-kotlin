/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.records


import java.time.OffsetDateTime

import jooq.main.enums.KotlinerStatusEnum
import jooq.main.tables.Kotliner

import org.jooq.JSONB
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerRecord() : UpdatableRecordImpl<KotlinerRecord>(Kotliner.KOTLINER) {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var created: OffsetDateTime?
        set(value): Unit = set(1, value)
        get(): OffsetDateTime? = get(1) as OffsetDateTime?

    open var updated: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var status: KotlinerStatusEnum?
        set(value): Unit = set(3, value)
        get(): KotlinerStatusEnum? = get(3) as KotlinerStatusEnum?

    open var avatar: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var description: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var normalizedEmail: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var originalEmail: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var firstName: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var lastName: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var nickname: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var password: String?
        set(value): Unit = set(11, value)
        get(): String? = get(11) as String?

    open var totp: String?
        set(value): Unit = set(12, value)
        get(): String? = get(12) as String?

    open var meta: JSONB?
        set(value): Unit = set(13, value)
        get(): JSONB? = get(13) as JSONB?

    open var version: Long?
        set(value): Unit = set(14, value)
        get(): Long? = get(14) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised KotlinerRecord
     */
    constructor(id: Long? = null, created: OffsetDateTime? = null, updated: OffsetDateTime? = null, status: KotlinerStatusEnum? = null, avatar: String? = null, description: String? = null, normalizedEmail: String? = null, originalEmail: String? = null, firstName: String? = null, lastName: String? = null, nickname: String? = null, password: String? = null, totp: String? = null, meta: JSONB? = null, version: Long? = null): this() {
        this.id = id
        this.created = created
        this.updated = updated
        this.status = status
        this.avatar = avatar
        this.description = description
        this.normalizedEmail = normalizedEmail
        this.originalEmail = originalEmail
        this.firstName = firstName
        this.lastName = lastName
        this.nickname = nickname
        this.password = password
        this.totp = totp
        this.meta = meta
        this.version = version
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised KotlinerRecord
     */
    constructor(value: jooq.main.tables.pojos.Kotliner?): this() {
        if (value != null) {
            this.id = value.id
            this.created = value.created
            this.updated = value.updated
            this.status = value.status
            this.avatar = value.avatar
            this.description = value.description
            this.normalizedEmail = value.normalizedEmail
            this.originalEmail = value.originalEmail
            this.firstName = value.firstName
            this.lastName = value.lastName
            this.nickname = value.nickname
            this.password = value.password
            this.totp = value.totp
            this.meta = value.meta
            this.version = value.version
            resetChangedOnNotNull()
        }
    }
}
