/*
 * This file is generated by jOOQ.
 */
package jooq.main.enums


import jooq.main.Public

import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class KotlinerStatusEnum(@get:JvmName("literal") public val literal: String) : EnumType {
    UNVERIFIED("UNVERIFIED"),
    ACTIVE("ACTIVE"),
    BANNED("BANNED"),
    DELETED("DELETED");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "kotliner_status_enum"
    override fun getLiteral(): String = literal
}
