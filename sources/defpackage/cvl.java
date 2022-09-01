package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cvl  reason: default package */
/* loaded from: classes.dex */
public final class cvl {
    static final hhl a = hhq.a("enable_bitmoji_cache", true);
    public static final hhl b = hhq.f("bitmoji_refresh_duration_hours", 3);
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore");
    private static volatile cvl h;
    public final Context d;
    public final Executor e = kcu.E(gxo.a(10));
    public final idk f = ieh.j();
    public final lgb g;

    private cvl(Context context) {
        this.d = context;
        this.g = jdg.n(new boh(context, 10));
        cvg.a(context, new cvj(this, 0));
    }

    public static cvk a(Throwable th) {
        if (th instanceof FileNotFoundException) {
            return cvk.FILE_NOT_FOUND;
        }
        if (th instanceof IOException) {
            return cvk.IO_EXCEPTION;
        }
        return cvk.OTHER_EXCEPTION;
    }

    public static cvl b(Context context) {
        cvl cvlVar;
        cvl cvlVar2 = h;
        if (cvlVar2 != null) {
            return cvlVar2;
        }
        synchronized (cvl.class) {
            if (h == null) {
                h = new cvl(context.getApplicationContext());
            }
            cvlVar = h;
        }
        return cvlVar;
    }

    public static void f(Context context) {
        ino K = ino.K(context, null);
        K.w("bitmoji_content_refresh_timestamp_key");
        K.w("bitmoji_content_refresh_locale_key");
    }

    public static boolean g(ino inoVar, Locale locale) {
        String d = inoVar.d("bitmoji_content_refresh_locale_key", null);
        return TextUtils.isEmpty(d) || !d.equals(locale.toLanguageTag());
    }

    public static boolean h(ino inoVar) {
        long c2 = inoVar.c("bitmoji_content_refresh_timestamp_key", -1L);
        long currentTimeMillis = System.currentTimeMillis() - c2;
        return c2 == -1 || currentTimeMillis <= 0 || currentTimeMillis > TimeUnit.HOURS.toMillis(((Long) b.c()).longValue());
    }

    public static boolean i(Context context, Locale locale) {
        if (!((Boolean) a.c()).booleanValue()) {
            return false;
        }
        ino K = ino.K(context, null);
        return h(K) || g(K, locale);
    }

    public final hiz c(final Locale locale) {
        idn a2 = ieh.j().a(ctg.STICKERS_BITMOJI_CACHE_STORE_GET_PACKS);
        hiz p = hiz.p(new Callable() { // from class: cvh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cvl cvlVar = cvl.this;
                Locale locale2 = locale;
                if (!((Boolean) cvl.a.c()).booleanValue()) {
                    throw new Exception("BitmojiCacheStore: cache is disabled!");
                }
                ((ltd) ((ltd) cvl.c.b()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "getStickerPackInternal", 330, "BitmojiCacheStore.java")).w("BitmojiCacheStore#getStickerPackInternal with locale: %s", locale2.toLanguageTag());
                if (!((File) cvlVar.g.a()).exists()) {
                    throw new FileNotFoundException();
                }
                ino K = ino.K(cvlVar.d, null);
                if (!cvl.g(K, locale2)) {
                    if (cvl.h(K)) {
                        ((ltd) ((ltd) cvl.c.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "getStickerPackInternal", 341, "BitmojiCacheStore.java")).t("The bitmoji cache is stale");
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream((File) cvlVar.g.a());
                        cxj cxjVar = (cxj) nfm.x(cxj.e, fileInputStream, nfb.b());
                        fileInputStream.close();
                        llk e = llp.e();
                        for (cxi cxiVar : cxjVar.b) {
                            String str = cxiVar.b;
                            String str2 = cxiVar.c;
                            llk e2 = llp.e();
                            for (cxh cxhVar : cxiVar.d) {
                                Uri parse = Uri.parse(cxhVar.b);
                                String d = lfd.d(parse.getLastPathSegment());
                                cwv b2 = cww.b();
                                b2.d(d);
                                b2.e(parse);
                                b2.c(mbr.BITMOJI_STICKER);
                                b2.a = "bitmoji";
                                b2.f(iil.o);
                                b2.b = (2 & cxhVar.a) != 0 ? cxhVar.c : null;
                                e2.h(b2.a());
                            }
                            cxb a3 = cxc.a();
                            a3.b = 2;
                            a3.e(str);
                            a3.d(str2);
                            a3.a = str2;
                            a3.g(iil.o);
                            a3.h(e2.g());
                            e.h(a3.a());
                        }
                        llp g = e.g();
                        if (!g.isEmpty()) {
                            ((ltd) ((ltd) cvl.c.b()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "getStickerPackInternal", 350, "BitmojiCacheStore.java")).t("BitmojiCacheStore: read from disk successfully!");
                            return g;
                        }
                        throw new Exception("BitmojiCacheStore: read from disk failed!");
                    } catch (Exception e3) {
                        if (!((File) cvlVar.g.a()).delete()) {
                            ((ltd) ((ltd) cvl.c.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "getStickerPackInternal", 357, "BitmojiCacheStore.java")).t("BitmojiCacheStore: failed to delete cache file.");
                        }
                        cvl.f(cvlVar.d);
                        throw new IOException("BitmojiCacheStore: constructing bitmoji sticker packs failed!", e3);
                    }
                }
                throw new IllegalStateException("The bitmoji cache locale has changed");
            }
        }, this.e);
        p.F(new bvo(this, locale, 9), mjl.a);
        Objects.requireNonNull(a2);
        p.d(new cbq(a2, 20), mjl.a);
        return p;
    }

    public final void d() {
        this.e.execute(new cvj(this, 1));
    }

    public final void e() {
        f(this.d);
        if (!((File) this.g.a()).exists() || ((File) this.g.a()).delete()) {
            return;
        }
        ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "clearCacheSync", 128, "BitmojiCacheStore.java")).t("failed to delete cache file");
    }
}
