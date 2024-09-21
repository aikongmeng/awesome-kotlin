/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.daos


import jooq.main.tables.VideoLibrary
import jooq.main.tables.records.VideoLibraryRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class VideoLibraryDao(configuration: Configuration?) : DAOImpl<VideoLibraryRecord, jooq.main.tables.pojos.VideoLibrary, Record2<Long?, Long?>>(VideoLibrary.VIDEO_LIBRARY, jooq.main.tables.pojos.VideoLibrary::class.java, configuration) {

    /**
     * Create a new VideoLibraryDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.main.tables.pojos.VideoLibrary): Record2<Long?, Long?> = compositeKeyRecord(o.videoId, o.libraryId)

    /**
     * Fetch records that have <code>video_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfVideoId(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.main.tables.pojos.VideoLibrary> = fetchRange(VideoLibrary.VIDEO_LIBRARY.VIDEO_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>video_id IN (values)</code>
     */
    fun fetchByVideoId(vararg values: Long): List<jooq.main.tables.pojos.VideoLibrary> = fetch(VideoLibrary.VIDEO_LIBRARY.VIDEO_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>library_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLibraryId(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.main.tables.pojos.VideoLibrary> = fetchRange(VideoLibrary.VIDEO_LIBRARY.LIBRARY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>library_id IN (values)</code>
     */
    fun fetchByLibraryId(vararg values: Long): List<jooq.main.tables.pojos.VideoLibrary> = fetch(VideoLibrary.VIDEO_LIBRARY.LIBRARY_ID, *values.toTypedArray())
}
