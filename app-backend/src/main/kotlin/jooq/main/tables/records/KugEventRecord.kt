/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.records


import java.time.OffsetDateTime

import jooq.main.enums.KugEventStatusEnum
import jooq.main.tables.KugEvent

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KugEventRecord() : UpdatableRecordImpl<KugEventRecord>(KugEvent.KUG_EVENT) {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var created: OffsetDateTime?
        set(value): Unit = set(1, value)
        get(): OffsetDateTime? = get(1) as OffsetDateTime?

    open var updated: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    open var updatedBy: Long?
        set(value): Unit = set(3, value)
        get(): Long? = get(3) as Long?

    open var status: KugEventStatusEnum?
        set(value): Unit = set(4, value)
        get(): KugEventStatusEnum? = get(4) as KugEventStatusEnum?

    open var kugId: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var title: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var latitude: Double?
        set(value): Unit = set(7, value)
        get(): Double? = get(7) as Double?

    open var longitude: Double?
        set(value): Unit = set(8, value)
        get(): Double? = get(8) as Double?

    open var version: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    /**
     * Create a detached, initialised KugEventRecord
     */
    constructor(id: Long? = null, created: OffsetDateTime? = null, updated: OffsetDateTime? = null, updatedBy: Long? = null, status: KugEventStatusEnum? = null, kugId: Long? = null, title: String? = null, latitude: Double? = null, longitude: Double? = null, version: Long? = null): this() {
        this.id = id
        this.created = created
        this.updated = updated
        this.updatedBy = updatedBy
        this.status = status
        this.kugId = kugId
        this.title = title
        this.latitude = latitude
        this.longitude = longitude
        this.version = version
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised KugEventRecord
     */
    constructor(value: jooq.main.tables.pojos.KugEvent?): this() {
        if (value != null) {
            this.id = value.id
            this.created = value.created
            this.updated = value.updated
            this.updatedBy = value.updatedBy
            this.status = value.status
            this.kugId = value.kugId
            this.title = value.title
            this.latitude = value.latitude
            this.longitude = value.longitude
            this.version = value.version
            resetChangedOnNotNull()
        }
    }
}
