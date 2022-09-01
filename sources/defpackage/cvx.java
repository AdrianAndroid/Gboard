package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cvx  reason: default package */
/* loaded from: classes.dex */
public final class cvx implements cwx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher");
    public final Context b;
    public final idk c;
    public final jls d;
    private final Executor e;
    private final ScheduledExecutorService f;
    private volatile hiz g;

    public cvx(Context context) {
        this(context.getApplicationContext(), gxo.a(9), gxo.c(19), ieh.j());
    }

    public static cvu a(Throwable th) {
        if (th instanceof cwy) {
            return cvu.STICKER_FETCHER_EXCEPTION;
        }
        if (th instanceof InterruptedException) {
            return cvu.INTERRUPTED_EXCEPTION;
        }
        if (th instanceof irb) {
            if (th instanceof ire) {
                return cvu.NULL_CURSOR;
            }
            if (th instanceof ird) {
                return cvu.NO_MATCHING_PROVIDER;
            }
            if (th instanceof irg) {
                return cvu.PROVIDER_UNAVAILABLE;
            }
            if (th instanceof irc) {
                return cvu.DEAD_CURSOR;
            }
            return cvu.OTHER_CONTENT_PROVIDER_EXCEPTION;
        } else if (th instanceof CancellationException) {
            return cvu.CANCELLATION_EXCEPTION;
        } else {
            if (th instanceof TimeoutException) {
                return cvu.TIMEOUT_EXCEPTION;
            }
            return cvu.OTHER_EXCEPTION;
        }
    }

    public static void i() {
        if (!Thread.currentThread().isInterrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    public final hiz b() {
        hiz hizVar = this.g;
        if (hizVar.C()) {
            return hizVar.o();
        }
        idn a2 = this.c.a(ctg.STICKERS_BITMOJI_FETCHER_GET_STATUS);
        hiz p = hiz.p(new Callable() { // from class: cvq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cvv cvvVar;
                cvx cvxVar = cvx.this;
                cuz cuzVar = cuz.a;
                if (!jam.H(cvxVar.b)) {
                    ((ltd) ((ltd) cvx.a.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "getBitmojiStatusSync", 436, "BitmojiFetcher.java")).t("Bitmoji is not installed");
                    cvxVar.c.e(ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, cvw.NOT_INSTALLED);
                    return cvv.NOT_INSTALLED;
                } else if (cuz.a.b(cvxVar.b)) {
                    ((ltd) ((ltd) cvx.a.d()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "getBitmojiStatusSync", 443, "BitmojiFetcher.java")).t("Bitmoji is required to be updated");
                    cvxVar.c.e(ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, cvw.UPDATE_REQUIRED);
                    return cvv.UPDATE_REQUIRED;
                } else {
                    try {
                        irh m = cvxVar.d.m(cvo.a().appendPath("status").build());
                        int columnIndex = m.getColumnIndex("status");
                        char c = 65535;
                        if (columnIndex == -1) {
                            throw new irb("Status column does not exist");
                        }
                        if (!m.moveToNext()) {
                            throw new irb("Failed to move the cursor to the status result");
                        }
                        String c2 = m.c(columnIndex);
                        ((ltd) ((ltd) cvx.a.b()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "getBitmojiStatusSync", 458, "BitmojiFetcher.java")).w("Bitmoji content provider status is: [%s]", c2);
                        int hashCode = c2.hashCode();
                        if (hashCode != 108386723) {
                            if (hashCode != 211933602) {
                                if (hashCode == 229434775 && c2.equals("no_avatar")) {
                                    c = 2;
                                }
                            } else if (c2.equals("no_access")) {
                                c = 1;
                            }
                        } else if (c2.equals("ready")) {
                            c = 0;
                        }
                        if (c == 0) {
                            cvxVar.c.e(ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, cvw.READY);
                            cvvVar = cvv.READY;
                        } else if (c == 1) {
                            cvxVar.c.e(ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, cvw.NO_ACCESS);
                            cvvVar = cvv.NO_ACCESS;
                        } else if (c != 2) {
                            cvxVar.c.e(ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, cvw.UNKNOWN_STATUS);
                            ((ltd) ((ltd) cvx.a.c()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "getBitmojiStatusSync", 479, "BitmojiFetcher.java")).w("Bitmoji status [%s] is not known", c2);
                            cvvVar = cvv.UNKNOWN;
                        } else {
                            cvxVar.c.e(ctf.BITMOJI_FETCHER_GET_STATUS_RESULT, cvw.NO_AVATAR);
                            cvvVar = cvv.NO_AVATAR;
                        }
                        m.close();
                        return cvvVar;
                    } catch (irb e) {
                        idk idkVar = cvxVar.c;
                        ctf ctfVar = ctf.BITMOJI_FETCHER_GET_STATUS_RESULT;
                        Object[] objArr = new Object[1];
                        objArr[0] = e instanceof ire ? cvw.NULL_CURSOR : e instanceof ird ? cvw.NO_MATCHING_PROVIDER : e instanceof irg ? cvw.PROVIDER_UNAVAILABLE : e instanceof irc ? cvw.DEAD_CURSOR : cvw.OTHER_CONTENT_PROVIDER_EXCEPTION;
                        idkVar.e(ctfVar, objArr);
                        ((ltd) ((ltd) ((ltd) cvx.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "getBitmojiStatusSync", (char) 486, "BitmojiFetcher.java")).t("Failed to interact with Bitmoji content provider");
                        return cvv.CONTENT_PROVIDER_EXCEPTION;
                    }
                }
            }
        }, this.e);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new bxj(this, 17));
        p.E(hjg.a(mjl.a, null, afpVar, z, e, e2, e3));
        this.g = p;
        Objects.requireNonNull(a2);
        p.d(new cvj(a2, 2), mjl.a);
        return p.o();
    }

    public final hiz c(Locale locale) {
        return j(1, locale);
    }

    public final hiz d(Locale locale) {
        return cvl.b(this.b).c(locale);
    }

    @Override // defpackage.cwx
    public final hja e(String str) {
        return hjg.e(new buf(this, str, 3));
    }

    public final lfb f(String str, String str2, Locale locale) {
        cxb a2 = cxc.a();
        a2.b = 2;
        a2.e(str);
        a2.a = str2;
        a2.d(str2);
        a2.g(iil.o);
        Uri.Builder appendQueryParameter = cvo.a().appendPath("pack").appendPath(str).appendQueryParameter("include_animated", "false");
        if (locale != null) {
            appendQueryParameter.appendQueryParameter("locale", cvo.e(locale));
        }
        a2.h(l(appendQueryParameter.build(), Integer.MAX_VALUE));
        try {
            return lfb.g(a2.a());
        } catch (IllegalStateException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "tryGetStickerPack", (char) 601, "BitmojiFetcher.java")).t("tryGetStickerPack(): Bitmoji Content Provider API error.");
            return ldu.a;
        }
    }

    public final llp g(final Locale locale) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        irh m = this.d.m(cvo.c(locale));
        try {
            int columnIndexOrThrow = m.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = m.getColumnIndexOrThrow("id");
            while (m.moveToNext()) {
                linkedHashMap.put(m.c(columnIndexOrThrow2), m.c(columnIndexOrThrow));
                i();
            }
            m.close();
            llk e = llp.e();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                lfb f = f((String) entry.getKey(), (String) entry.getValue(), locale);
                if (f.e()) {
                    e.h((cxc) f.a());
                }
                i();
            }
            final llp g = e.g();
            if (!g.isEmpty()) {
                final cvl b = cvl.b(this.b);
                hiz.G(new Runnable() { // from class: cvi
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str = "BitmojiCacheStore.java";
                        cvl cvlVar = cvl.this;
                        llp llpVar = g;
                        Locale locale2 = locale;
                        try {
                            if (!((Boolean) cvl.a.c()).booleanValue()) {
                                throw new Exception("BitmojiCacheStore: cache is disabled!");
                            }
                            ((ltd) ((ltd) cvl.c.b()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "setStickerPacksInternal", 188, str)).w("BitmojiCacheStore#setStickerPacksInternal with locale : %s", locale2.toLanguageTag());
                            ArrayList arrayList = new ArrayList(((lrl) llpVar).c);
                            long currentTimeMillis = System.currentTimeMillis();
                            int i = ((lrl) llpVar).c;
                            int i2 = 0;
                            while (i2 < i) {
                                cxc cxcVar = (cxc) llpVar.get(i2);
                                nfh t = cxi.e.t();
                                String str2 = cxcVar.b;
                                if (t.c) {
                                    t.cD();
                                    t.c = false;
                                }
                                cxi cxiVar = (cxi) t.b;
                                str2.getClass();
                                int i3 = cxiVar.a | 1;
                                cxiVar.a = i3;
                                cxiVar.b = str2;
                                String str3 = cxcVar.h;
                                str3.getClass();
                                cxiVar.a = i3 | 2;
                                cxiVar.c = str3;
                                ArrayList arrayList2 = new ArrayList(cxcVar.g.size());
                                llp llpVar2 = cxcVar.g;
                                int size = llpVar2.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    llp llpVar3 = llpVar;
                                    cww cwwVar = (cww) llpVar2.get(i4);
                                    llp llpVar4 = llpVar2;
                                    nfh t2 = cxh.d.t();
                                    int i5 = size;
                                    String uri = cwwVar.b.toString();
                                    int i6 = i;
                                    if (t2.c) {
                                        t2.cD();
                                        t2.c = false;
                                    }
                                    cxh cxhVar = (cxh) t2.b;
                                    uri.getClass();
                                    String str4 = str;
                                    int i7 = cxhVar.a | 1;
                                    cxhVar.a = i7;
                                    cxhVar.b = uri;
                                    String str5 = cwwVar.c;
                                    if (str5 != null) {
                                        cxhVar.a = i7 | 2;
                                        cxhVar.c = str5;
                                    }
                                    arrayList2.add((cxh) t2.cz());
                                    i4++;
                                    size = i5;
                                    llpVar = llpVar3;
                                    llpVar2 = llpVar4;
                                    i = i6;
                                    str = str4;
                                }
                                String str6 = str;
                                llp llpVar5 = llpVar;
                                int i8 = i;
                                if (t.c) {
                                    t.cD();
                                    t.c = false;
                                }
                                cxi cxiVar2 = (cxi) t.b;
                                nga ngaVar = cxiVar2.d;
                                if (!ngaVar.c()) {
                                    cxiVar2.d = nfm.H(ngaVar);
                                }
                                ndt.cs(arrayList2, cxiVar2.d);
                                arrayList.add((cxi) t.cz());
                                i2++;
                                llpVar = llpVar5;
                                i = i8;
                                str = str6;
                            }
                            String str7 = str;
                            nfh t3 = cxj.e.t();
                            if (t3.c) {
                                t3.cD();
                                t3.c = false;
                            }
                            cxj cxjVar = (cxj) t3.b;
                            nga ngaVar2 = cxjVar.b;
                            if (!ngaVar2.c()) {
                                cxjVar.b = nfm.H(ngaVar2);
                            }
                            ndt.cs(arrayList, cxjVar.b);
                            if (t3.c) {
                                t3.cD();
                                t3.c = false;
                            }
                            cxj cxjVar2 = (cxj) t3.b;
                            cxjVar2.a |= 2;
                            cxjVar2.d = currentTimeMillis;
                            String languageTag = locale2.toLanguageTag();
                            if (t3.c) {
                                t3.cD();
                                t3.c = false;
                            }
                            cxj cxjVar3 = (cxj) t3.b;
                            languageTag.getClass();
                            cxjVar3.a |= 1;
                            cxjVar3.c = languageTag;
                            cxj cxjVar4 = (cxj) t3.cz();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream((File) cvlVar.g.a());
                                try {
                                    cxjVar4.p(fileOutputStream);
                                    ((ltd) ((ltd) cvl.c.b()).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiCacheStore", "setStickerPacksInternal", 221, str7)).t("BitmojiCacheStore: write to disk successfully!");
                                    Context context = cvlVar.d;
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    String languageTag2 = locale2.toLanguageTag();
                                    ino K = ino.K(context, null);
                                    K.i("bitmoji_content_refresh_timestamp_key", currentTimeMillis2);
                                    K.j("bitmoji_content_refresh_locale_key", languageTag2);
                                    fileOutputStream.close();
                                    cvlVar.f.e(ctf.BITMOJI_CACHE_STORE_SET_PACKS, cvk.SUCCESS);
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                cvlVar.e();
                                throw new IOException("BitmojiCacheStore: write to disk failed!", e2);
                            }
                        } catch (Throwable th3) {
                            cvlVar.f.e(ctf.BITMOJI_CACHE_STORE_SET_PACKS, cvl.a(th3));
                        }
                    }
                }, b.e);
            }
            return g;
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mko h(final Locale locale) {
        hiz o = b().h(bzg.l, mjl.a).s(new hiv() { // from class: cvp
            @Override // defpackage.hiv
            public final Object a(Object obj) {
                cvx cvxVar = cvx.this;
                Locale locale2 = locale;
                cvv cvvVar = (cvv) obj;
                idn a2 = cvxVar.c.a(ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS_REFRESH_CACHE);
                try {
                    return cvxVar.g(locale2);
                } finally {
                    a2.a();
                }
            }
        }, this.e).w(30L, TimeUnit.SECONDS, this.f).o();
        o.F(new buo(this, 8), this.e);
        return o;
    }

    public final hiz j(int i, Locale locale) {
        idn a2 = this.c.a(i == 2 ? ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS_FAVORITES : ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS_ALL);
        hiz p = hiz.p(new cvs(this, i, locale, 0), this.e);
        Objects.requireNonNull(a2);
        p.d(new cvj(a2, 2), mjl.a);
        return p;
    }

    @Override // defpackage.cwx
    public final mko k(int i) {
        idn a2 = this.c.a(ctg.STICKERS_BITMOJI_FETCHER_GET_PACKS);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Locale e = hqp.e();
        hiz o = cvl.b(this.b).c(e).e(new cvr(this, atomicBoolean, e, 0), mjl.a).w(30L, TimeUnit.SECONDS, this.f).o();
        o.F(new cvt(this, atomicBoolean, e, 0), this.e);
        Objects.requireNonNull(a2);
        o.d(new cvj(a2, 2), mjl.a);
        return o;
    }

    public final llp l(Uri uri, int i) {
        llk e = llp.e();
        irh m = this.d.m(uri);
        try {
            if (m.getCount() != 0) {
                if (m.getCount() <= 0) {
                    throw new cwy(String.format(Locale.US, "Start position %d is out of bounds of cursor with %d rows", 0, Integer.valueOf(m.getCount())));
                }
                int columnIndexOrThrow = m.getColumnIndexOrThrow("uri");
                int columnIndexOrThrow2 = m.getColumnIndexOrThrow("text");
                m.moveToPosition(-1);
                while (m.moveToNext() && m.getPosition() < i) {
                    Uri b = cvo.b(m.c(columnIndexOrThrow));
                    String string = m.getString(columnIndexOrThrow2);
                    try {
                        cwv b2 = cww.b();
                        b2.d(lfd.d(b.getLastPathSegment()));
                        b2.e(b);
                        b2.a = "bitmoji";
                        b2.c(mbr.BITMOJI_STICKER);
                        b2.f(iil.o);
                        b2.b = string;
                        e.h(b2.a());
                    } catch (IllegalStateException e2) {
                        ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/sticker/BitmojiFetcher", "fetchStickerResults", (char) 674, "BitmojiFetcher.java")).t("fetchStickerResults(): Bitmoji Content Provider API error.");
                    }
                    i();
                }
                llp g = e.g();
                m.close();
                return g;
            }
            llp g2 = e.g();
            m.close();
            return g2;
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    public final hiz m(String str, int i, boolean z) {
        idn a2 = this.c.a(ctg.STICKERS_BITMOJI_FETCHER_SEARCH);
        hiz w = hiz.p(new hdd(this, str, hqp.e(), z, i, 1), this.e).w(cva.e, TimeUnit.MILLISECONDS, this.f);
        w.F(new buo(this, 9), this.e);
        Objects.requireNonNull(a2);
        w.d(new cvj(a2, 2), mjl.a);
        return w;
    }

    @Override // defpackage.cwx
    public final mko n(String str) {
        idn a2 = this.c.a(ctg.STICKERS_BITMOJI_FETCHER_SUGGEST);
        hiz w = hiz.p(new cak(this, str, hqp.e(), 3), this.e).w(cva.e, TimeUnit.MILLISECONDS, this.f);
        w.F(new buo(this, 10), this.e);
        Objects.requireNonNull(a2);
        w.d(new cvj(a2, 2), mjl.a);
        return w;
    }

    public cvx(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, idk idkVar) {
        this.g = hiz.l();
        this.b = context;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.c = idkVar;
        this.d = new jls(context, null, null);
    }
}
