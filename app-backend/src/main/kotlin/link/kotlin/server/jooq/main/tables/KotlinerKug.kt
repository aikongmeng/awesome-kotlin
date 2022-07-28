/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.time.LocalDate

import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.KOTLINER_KUG__KOTLINER_KUG_KOTLINER_ID_FKEY
import link.kotlin.server.jooq.main.keys.KOTLINER_KUG__KOTLINER_KUG_KUG_ID_FKEY
import link.kotlin.server.jooq.main.keys.UNIQUE_KOTLINER_KUG
import link.kotlin.server.jooq.main.tables.records.KotlinerKugRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row3
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerKug(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, KotlinerKugRecord>?,
    aliased: Table<KotlinerKugRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<KotlinerKugRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.kotliner_kug</code>
         */
        val KOTLINER_KUG: KotlinerKug = KotlinerKug()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KotlinerKugRecord> = KotlinerKugRecord::class.java

    /**
     * The column <code>public.kotliner_kug.kotliner_id</code>.
     */
    val KOTLINER_ID: TableField<KotlinerKugRecord, Long?> = createField(DSL.name("kotliner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.kotliner_kug.kug_id</code>.
     */
    val KUG_ID: TableField<KotlinerKugRecord, Long?> = createField(DSL.name("kug_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.kotliner_kug.join_date</code>.
     */
    val JOIN_DATE: TableField<KotlinerKugRecord, LocalDate?> = createField(DSL.name("join_date"), SQLDataType.LOCALDATE.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<KotlinerKugRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<KotlinerKugRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.kotliner_kug</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.kotliner_kug</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.kotliner_kug</code> table reference
     */
    constructor(): this(DSL.name("kotliner_kug"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, KotlinerKugRecord>): this(Internal.createPathAlias(child, key), child, key, KOTLINER_KUG, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getUniqueKeys(): List<UniqueKey<KotlinerKugRecord>> = listOf(UNIQUE_KOTLINER_KUG)
    override fun getReferences(): List<ForeignKey<KotlinerKugRecord, *>> = listOf(KOTLINER_KUG__KOTLINER_KUG_KOTLINER_ID_FKEY, KOTLINER_KUG__KOTLINER_KUG_KUG_ID_FKEY)

    private lateinit var _kotliner: Kotliner
    private lateinit var _kug: Kug

    /**
     * Get the implicit join path to the <code>public.kotliner</code> table.
     */
    fun kotliner(): Kotliner {
        if (!this::_kotliner.isInitialized)
            _kotliner = Kotliner(this, KOTLINER_KUG__KOTLINER_KUG_KOTLINER_ID_FKEY)

        return _kotliner;
    }

    /**
     * Get the implicit join path to the <code>public.kug</code> table.
     */
    fun kug(): Kug {
        if (!this::_kug.isInitialized)
            _kug = Kug(this, KOTLINER_KUG__KOTLINER_KUG_KUG_ID_FKEY)

        return _kug;
    }
    override fun `as`(alias: String): KotlinerKug = KotlinerKug(DSL.name(alias), this)
    override fun `as`(alias: Name): KotlinerKug = KotlinerKug(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): KotlinerKug = KotlinerKug(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): KotlinerKug = KotlinerKug(name, null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<Long?, Long?, LocalDate?> = super.fieldsRow() as Row3<Long?, Long?, LocalDate?>
}
