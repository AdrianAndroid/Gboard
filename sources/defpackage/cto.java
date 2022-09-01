package defpackage;

/* compiled from: PG */
/* renamed from: cto  reason: default package */
/* loaded from: classes.dex */
public final class cto implements idr {
    private static final llw a;
    private final idi b;

    static {
        lls h = llw.h();
        h.a(ctg.CONV2QUERY_FEATURIZE_CANDIDATE, "Conv2QueryExtension.featurizeCandidate-time");
        h.a(ctg.FEDERATEDC2Q_EXTENSION_ON_CREATE_APP, "FederatedC2QExtension.onCreateApp-time");
        h.a(ctg.FEDERATEDC2Q_EXTENSION_ON_CREATE_SERVICE, "FederatedC2QExtension.onCreateService-time");
        h.a(ctg.FEDERATEDC2Q_EXTENSION_ON_START_INPUT_VIEW, "FederatedC2QExtension.onStartInputView-time");
        h.a(ctg.FEDERATEDC2Q_EXTENSION_EXTRA_CANDIDATES_INITIALIZE, "FederatedC2QExtension.extraCandidatesInitialize-time");
        h.a(ctg.FEDERATEDC2Q_EXTENSION_EXTRA_CANDIDATES_GENERATE, "FederatedC2QExtension.extraCandidatesGenerate-time");
        h.a(hdr.a, "Emoji.Compat.Initialization-time");
        h.a(crh.IMAGE_SHARE_TOTAL, "Image.Share.total-time");
        h.a(crh.CREATE_STATIC_WHATSAPP_WEBP, "WhatsAppWebp.Convert.Static.Latency");
        h.a(crh.CREATE_ANIMATED_WHATSAPP_WEBP, "WhatsAppWebp.Convert.Animated.Latency");
        h.a(crh.BITMOJI_SHARE_INSERT, "Image.Share.BitmojiContentProvider.insert-time");
        h.a(crh.BITMOJI_SHARE_COPY, "Image.Share.BitmojiContentProvider.copy-time");
        h.a(crh.BITMOJI_SHARE_INSERT_AND_COPY, "Image.Share.BitmojiContentProvider.insertAndCopy-time");
        h.a(crh.BITMOJI_SHARE_TOTAL, "Image.Share.BitmojiContentProvider.total-time");
        h.a(ctg.EXT_GIF_ACTIVATE, "GifExtension.activate-time");
        h.a(ctg.EXT_GIF_DEACTIVATE, "GifExtension.deactivate-time");
        h.a(ctg.EXT_GIF_KB_ACTIVATE, "GifExtension.activateKB-time");
        h.a(ctg.EXT_EMOJI_1ST_STARTUP, "Emoji.Extension.Startup.FirstTime-time");
        h.a(ctg.EXT_EMOJI_2ND_OR_LATER_STARTUP, "Emoji.Extension.Startup.SecondOrLaterTime-time");
        h.a(ctg.EXT_EMOJI_ACTIVATE, "SearchEmojiExtension.activate-time");
        h.a(ctg.EXT_EMOJI_DEACTIVATE, "SearchEmojiExtension.deactivate-time");
        h.a(ctg.EXT_EMOJI_KB_ACTIVATE, "SearchEmojiExtension.activateKB-time");
        h.a(ctg.EXT_BITMOJI_ACTIVATE, "BitmojiExtension.activate-time");
        h.a(ctg.EXT_BITMOJI_DEACTIVATE, "BitmojiExtension.deactivate-time");
        h.a(ctg.EXT_BITMOJI_KB_ACTIVATE, "BitmojiExtension.activateKB-time");
        h.a(ctg.EXT_STICKER_ACTIVATE, "StickerExtension.activate-time");
        h.a(ctg.EXT_STICKER_DEACTIVATE, "StickerExtension.deactivate-time");
        h.a(ctg.EXT_STICKER_KB_ACTIVATE, "StickerExtension.activateKB-time");
        h.a(ctg.EXT_EMOJIDATA_ACTIVATE, "EmojiDataExtension.activate-time");
        h.a(ctg.EXT_EMOJIDATA_DEACTIVATE, "EmojiDataExtension.deactivate-time");
        h.a(ctg.GIF_EXTENSION_SHOWN_TIME, "GifKeyboard.keyboardStay-time");
        h.a(ctg.EMOJI_SEARCH_EXTENSION_SHOWN_TIME, "SearchEmoji.keyboardStay-time");
        h.a(ctg.EXT_UNIVERSAL_MEDIA_ACTIVATE, "UniversalMediaExtension.activate-time");
        h.a(ctg.EXT_UNIVERSAL_MEDIA_KB_ACTIVATE, "UniversalMediaExtension.activateKB-time");
        h.a(ctg.EXT_UNIVERSAL_MEDIA_DEACTIVATE, "UniversalMediaExtension.deactivate-time");
        h.a(ctg.UNIVERSAL_MEDIA_RECENT_EMOJI_FETCHER_TIME, "UniversalMediaExtension.recentEmojiFetcher-time");
        h.a(ctg.UNIVERSAL_MEDIA_RECENT_GIF_FETCHER_TIME, "UniversalMediaExtension.recentGifFetcher-time");
        h.a(ctg.UNIVERSAL_MEDIA_RECENT_STICKER_FETCHER_TIME, "UniversalMediaExtension.recentStickerFetcher-time");
        h.a(ctg.UNIVERSAL_MEDIA_SEARCH_EMOJI_FETCHER_TIME, "UniversalMediaExtension.searchEmojiFetcher-time");
        h.a(ctg.UNIVERSAL_MEDIA_SEARCH_GIF_FETCHER_TIME, "UniversalMediaExtension.searchGifFetcher-time");
        h.a(ctg.UNIVERSAL_MEDIA_SEARCH_STICKER_FETCHER_TIME, "UniversalMediaExtension.searchStickerFetcher-time");
        h.a(ctg.UNIVERSAL_MEDIA_DATA_READY_TIME, "UniversalMediaKeyboard.dataReady-time");
        h.a(ctg.EXPRESSIVE_STICKER_CLIENT_INITIALIZE, "ExpressiveStickerClient.initialize-time");
        h.a(ctg.EXPRESSIVE_STICKER_CLIENT_SYNC, "ExpressiveStickerClient.sync-time");
        h.a(crh.IMAGE_MIGRATOR_TIME, "ImageMigrator.migrate-time");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS, "StickerFetcher.Bitmoji.GetPacks.Latency");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS_ALL, "StickerFetcher.Bitmoji.GetPacks.All.Latency");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS_FAVORITES, "StickerFetcher.Bitmoji.GetPacks.Favorites.Latency");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS_REFRESH_CACHE, "StickerFetcher.Bitmoji.GetPacks.RefreshCache.Latency");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_SEARCH, "StickerFetcher.Bitmoji.Search.Latency");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_SUGGEST, "StickerFetcher.Bitmoji.Suggest.Latency");
        h.a(ctg.STICKERS_BITMOJI_CONTEXTUAL_FETCHER_GET_CONTEXTUAL_PACKS, "StickerFetcher.Bitmoji.GetContextualPacks.Latency");
        h.a(ctg.STICKERS_BITMOJI_FETCHER_GET_STATUS, "StickerFetcher.Bitmoji.GetStatus.Latency");
        h.a(ctg.BITMOJI_IMAGE_OPEN_INPUTSTREAM, "Bitmoji.Image.OpenInputStream.Latency");
        h.a(ctg.STICKERS_BITMOJI_CACHE_STORE_GET_PACKS, "StickerFetcher.Bitmoji.CacheStore.GetPacks.Latency");
        h.a(ctg.STICKERS_EXPRESSIVE_FETCHER_GET_PACKS, "StickerFetcher.Expressive.GetPacks.Latency");
        h.a(ctg.STICKERS_EXPRESSIVE_FETCHER_SEARCH, "StickerFetcher.Expressive.Search.Latency");
        h.a(ctg.STICKERS_EXPRESSIVE_FETCHER_SUGGEST, "StickerFetcher.Expressive.Suggest.Latency");
        h.a(ctg.STICKERS_MULTI_FETCHER_GET_PACKS, "StickerFetcher.Multi.GetPacks.Latency");
        h.a(ctg.STICKERS_MULTI_FETCHER_SEARCH, "StickerFetcher.Multi.Search.Latency");
        h.a(ctg.STICKERS_MULTI_FETCHER_SUGGEST, "StickerFetcher.Multi.Suggest.Latency");
        h.a(ctg.CONTENT_CACHE_DOWNLOAD_TASK, "ContentCache.Latency.DownloadAndCacheImages");
        h.a(cjk.a, "ExpressionCandidates.Supplier.Response.Latency");
        h.a(cjk.b, "ExpressionCandidates.Cache.Bitmoji.BatchUpdateTime");
        h.a(cjk.c, "ExpressionCandidates.Cache.Bitmoji.SingleUpdateTime");
        h.a(ctg.USAGE_HISTOGRAM_STORE_INCREMENT_COUNTER, "ShareUsageHistogramStore.IncrementCounters.Latency");
        h.a(ctg.FAST_ACCESS_BAR_ACTIVATE, "FastAccessBar.Activate.Latency");
        h.a(ctg.FAST_ACCESS_BAR_FETCH_FREQUENT_EMOJIS, "FastAccessBar.FetchFrequentEmojis.Latency");
        h.a(ctg.DYNAMIC_ART_STICKER_GENERATION, "DynamicArt.Generation.Latency");
        h.a(ctg.DYNAMIC_ART_STICKER_SELECTION, "DynamicArt.Selection.Latency");
        a = h.l();
    }

    public cto(idi idiVar) {
        this.b = idiVar;
    }

    public static void c(ieh iehVar) {
        iehVar.x(cto.class);
    }

    @Override // defpackage.idr
    public final lmz a() {
        return a.keySet();
    }

    @Override // defpackage.idr
    public final void b(ids idsVar, long j) {
        String str = (String) a.get(idsVar);
        if (str != null) {
            this.b.e(str, j);
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final void f() {
        this.b.a();
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }
}
