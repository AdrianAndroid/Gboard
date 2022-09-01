package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cri  reason: default package */
/* loaded from: classes.dex */
public final class cri {
    private static final lex c;
    private final Context e;
    private final ino f;
    private final Map g;
    private final Map h = new qo();
    private final String i;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/image/RecentImages");
    private static final Map b = new qo();
    private static final lfy d = lfy.e(",");

    static {
        lex d2 = lex.d(",");
        c = new leu(d2, d2);
    }

    public cri(Context context, String str) {
        String str2;
        lfb g;
        this.e = context.getApplicationContext();
        this.i = str;
        ino K = ino.K(context, null);
        this.f = K;
        Set<String> e = K.e(str, new LinkedHashSet());
        dav a2 = daw.a();
        a2.b();
        a2.a = 10;
        a2.c();
        this.g = a2.a();
        for (String str3 : e) {
            List k = d.k(str3);
            if (!o(k)) {
                if (k.size() < 8) {
                    g = ldu.a;
                } else {
                    int i = 9;
                    while (true) {
                        if (i >= k.size()) {
                            str2 = null;
                            break;
                        } else if (cqp.w((String) k.get(i))) {
                            str2 = (String) k.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        g = ldu.a;
                    } else {
                        ArrayList arrayList = new ArrayList(k.subList(0, 8));
                        arrayList.addAll(Collections.nCopies(7, "null"));
                        arrayList.set(9, str2);
                        g = lfb.g(arrayList);
                    }
                }
                if (!g.e()) {
                    ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "<init>", 145, "RecentImages.java")).w("Remove invalid recent %s", k);
                } else {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "<init>", 148, "RecentImages.java")).w("Recovered invalid recent %s", k);
                    k = (List) g.a();
                    str3 = c.f(k);
                }
            }
            String d2 = d(k, 4);
            String d3 = d(k, 7);
            String d4 = d(k, 11);
            if (!TextUtils.isEmpty(d2)) {
                llk e2 = llp.e();
                if (!TextUtils.isEmpty(d3)) {
                    e2.h(new File(d3));
                }
                if (!TextUtils.isEmpty(d4)) {
                    e2.h(new File(d4));
                }
                this.g.put(d2, str3);
                this.h.put(d2, e2.g());
            }
        }
    }

    static int a(List list, int i) {
        String d2 = d(list, i);
        if (d2 != null) {
            try {
                return Integer.parseInt(d2);
            } catch (NumberFormatException e) {
                ((ltd) ((ltd) a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "getFieldInt", 526, "RecentImages.java")).t("Error while retrieving field int");
                return 0;
            }
        }
        return 0;
    }

    public static cri b(Context context, String str) {
        cri criVar;
        synchronized (cri.class) {
            Map map = b;
            criVar = (cri) map.get(str);
            if (criVar == null) {
                criVar = new cri(context, str);
                map.put(str, criVar);
            }
        }
        return criVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static lfb c(Context context, cqp cqpVar) {
        char c2;
        if (cqpVar.m() == mbr.EMOJI_KITCHEN_STICKER || cqpVar.m() == mbr.EMOJI_KITCHEN_MIX) {
            return lfb.g(b(context, "recent_content_suggestion_shared"));
        }
        String r = cqpVar.r();
        switch (r.hashCode()) {
            case -1890252483:
                if (r.equals("sticker")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1448896059:
                if (r.equals("tenor_gif")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -102405906:
                if (r.equals("bitmoji")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 102340:
                if (r.equals("gif")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1193771095:
                if (r.equals("curated_gif")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            return lfb.g(b(context, "recent_gifs_shared"));
        }
        if (c2 == 3) {
            return lfb.g(b(context, "recent_sticker_shared"));
        }
        if (c2 == 4) {
            return lfb.g(b(context, "recent_bitmoji_shared"));
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "getInstanceForImage", 120, "RecentImages.java")).w("Image source is unknown: %s", cqpVar.r());
        return ldu.a;
    }

    static String d(List list, int i) {
        if (i >= list.size()) {
            return null;
        }
        String str = (String) list.get(i);
        if (!"null".equals(str)) {
            return str;
        }
        return null;
    }

    private static void l(File file, llp llpVar) {
        if (lre.ag(llpVar, new cjm(file, 6))) {
            jan.b.e(file);
        }
    }

    private final void m(List list, List list2) {
        HashSet<String> hashSet = new HashSet(this.h.keySet());
        for (String str : this.g.keySet()) {
            hashSet.remove(str);
        }
        llp s = llp.s(crk.d(this.e), crk.e(this.e));
        for (String str2 : hashSet) {
            llp llpVar = (llp) this.h.get(str2);
            if (llpVar == null) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "maybeDeleteOldFiles", 442, "RecentImages.java")).t("Error in maybeDeleteOldFiles - unexpectedly null file path list.");
            } else {
                int size = llpVar.size();
                for (int i = 0; i < size; i++) {
                    l((File) llpVar.get(i), s);
                }
                this.h.remove(str2);
            }
        }
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (list == null || !list.contains(file)) {
                    l(file, s);
                }
            }
        }
    }

    private final void n() {
        LinkedHashSet linkedHashSet;
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.g.values());
        }
        this.f.k(this.i, linkedHashSet);
    }

    private static boolean o(List list) {
        return list.size() == 15 && cqp.y(d(list, 9));
    }

    public final List e() {
        return f(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List f(boolean z) {
        llp o;
        char c2;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            o = llp.o(this.g.values());
        }
        int size = o.size();
        for (int i = 0; i < size; i++) {
            List k = d.k((String) o.get(i));
            if (!o(k)) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "getRecentImages", 242, "RecentImages.java")).w("Ignoring invalid recent %s", k);
            } else {
                cqo t = cqp.t();
                String d2 = d(k, 4);
                if (d2 == null) {
                    ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "getRecentImages", 249, "RecentImages.java")).t("Skipped invalid recent image without image url");
                } else {
                    String d3 = d(k, 7);
                    if (TextUtils.isEmpty(d3) || !z || crk.a(this.e, new File(d3)).e()) {
                        t.n(a(k, 0));
                        t.f(a(k, 1));
                        t.h(Uri.parse(d2));
                        t.b = d(k, 5);
                        t.c = d(k, 6);
                        t.f = d(k, 8);
                        t.g(lfd.d(d(k, 10)));
                        t.j(iil.c);
                        String d4 = d(k, 9);
                        if (d4 == null) {
                            d4 = "";
                        }
                        t.l(d4);
                        mbr b2 = mbr.b(a(k, 14));
                        if (b2 == null || b2 == mbr.UNKNOWN_CONTENT_TYPE) {
                            switch (d4.hashCode()) {
                                case -1448896059:
                                    if (d4.equals("tenor_gif")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -102405906:
                                    if (d4.equals("bitmoji")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 102340:
                                    if (d4.equals("gif")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1193771095:
                                    if (d4.equals("curated_gif")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                b2 = mbr.BITMOJI_STICKER;
                            } else if (c2 == 1 || c2 == 2) {
                                b2 = mbr.TENOR_GIF;
                            } else if (c2 != 3) {
                                b2 = "recent_bitmoji_shared".equals(this.i) ? mbr.BITMOJI_STICKER : mbr.UNKNOWN_CONTENT_TYPE;
                            } else {
                                b2 = mbr.IMAGE_SEARCH_GIF;
                            }
                        }
                        t.e(b2);
                        if (!TextUtils.isEmpty(d3)) {
                            t.c(d3);
                        }
                        t.c(d(k, 11));
                        arrayList.add(0, t.a());
                    } else {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "getRecentImages", 256, "RecentImages.java")).w("Skipped and removing invalid recent image at cache path %s", d3);
                        this.g.remove(d2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void g() {
        this.g.clear();
        m(null, null);
        this.h.clear();
        n();
    }

    public final synchronized void h(cqp cqpVar) {
        File u = cqpVar.u();
        File file = (File) cqpVar.k().get("image/webp.wasticker");
        if (u == null && file == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/image/RecentImages", "putImage", 339, "RecentImages.java")).t("Cannot store images without local cache file paths in recents.");
            return;
        }
        lex lexVar = c;
        Integer valueOf = Integer.valueOf(cqpVar.c());
        Integer valueOf2 = Integer.valueOf(cqpVar.b());
        Object[] objArr = new Object[13];
        objArr[0] = 0;
        objArr[1] = 0;
        objArr[2] = cqpVar.d().toString();
        objArr[3] = cqpVar.q();
        objArr[4] = cqpVar.p();
        objArr[5] = u != null ? u.getAbsolutePath() : null;
        objArr[6] = cqpVar.n() != null ? cqpVar.n().replace(',', ' ') : null;
        objArr[7] = cqpVar.r();
        objArr[8] = cqpVar.o();
        objArr[9] = file != null ? file.getAbsolutePath() : null;
        objArr[10] = null;
        objArr[11] = null;
        objArr[12] = Integer.valueOf(cqpVar.m().l);
        String h = lexVar.h(valueOf, valueOf2, objArr);
        llp o = llp.o(cqpVar.k().values());
        this.g.put(cqpVar.d().toString(), h);
        m(o, (llp) this.h.put(cqpVar.d().toString(), o));
        n();
    }

    public final synchronized void i(cqp cqpVar) {
        this.g.remove(cqpVar.d().toString());
        m(null, null);
        n();
    }

    public final synchronized void j(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.g);
        this.g.clear();
        int min = Math.min(list.size(), 10 - this.g.size());
        while (true) {
            min--;
            if (min >= 0) {
                cqp cqpVar = (cqp) list.get(min);
                lex lexVar = c;
                Integer valueOf = Integer.valueOf(cqpVar.c());
                Integer valueOf2 = Integer.valueOf(cqpVar.b());
                Object[] objArr = new Object[13];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = cqpVar.d().toString();
                objArr[3] = cqpVar.q();
                objArr[4] = cqpVar.p();
                objArr[5] = null;
                objArr[6] = cqpVar.n() != null ? cqpVar.n().replace(',', ' ') : null;
                objArr[7] = cqpVar.r();
                objArr[8] = cqpVar.o();
                objArr[9] = null;
                objArr[10] = null;
                objArr[11] = null;
                objArr[12] = Integer.valueOf(cqpVar.m().l);
                this.g.put(cqpVar.d().toString(), lexVar.h(valueOf, valueOf2, objArr));
            } else {
                this.g.putAll(linkedHashMap);
                n();
            }
        }
    }

    public final boolean k() {
        return this.g.isEmpty();
    }
}
