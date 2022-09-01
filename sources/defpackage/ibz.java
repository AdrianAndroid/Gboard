package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: ibz  reason: default package */
/* loaded from: classes.dex */
public final class ibz {
    public static final ibz a;
    public static final ibz b;
    public static final ibz c;
    public static final ibz d;
    public static final ibz e;
    public static final ibz f;
    public static final ibz g;
    public static final ibz h;
    public static final ibz i;
    public static final ibz j;
    public static final ibz k;
    private static final ltg m = ltg.j("com/google/android/libraries/inputmethod/metadata/KeyboardType");
    private static final ConcurrentHashMap n;
    public final String l;

    static {
        ibz ibzVar = new ibz("prime");
        a = ibzVar;
        ibz ibzVar2 = new ibz("digit");
        b = ibzVar2;
        ibz ibzVar3 = new ibz("symbol");
        c = ibzVar3;
        ibz ibzVar4 = new ibz("smiley");
        d = ibzVar4;
        ibz ibzVar5 = new ibz("emoticon");
        e = ibzVar5;
        ibz ibzVar6 = new ibz("search_result");
        f = ibzVar6;
        ibz ibzVar7 = new ibz("secondary");
        g = ibzVar7;
        ibz ibzVar8 = new ibz("english");
        h = ibzVar8;
        ibz ibzVar9 = new ibz("rich_symbol");
        i = ibzVar9;
        ibz ibzVar10 = new ibz("handwriting");
        j = ibzVar10;
        ibz ibzVar11 = new ibz("empty");
        k = ibzVar11;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        n = concurrentHashMap;
        concurrentHashMap.put("prime", ibzVar);
        concurrentHashMap.put("digit", ibzVar2);
        concurrentHashMap.put("symbol", ibzVar3);
        concurrentHashMap.put("smiley", ibzVar4);
        concurrentHashMap.put("emoticon", ibzVar5);
        concurrentHashMap.put("rich_symbol", ibzVar9);
        concurrentHashMap.put("search_result", ibzVar6);
        concurrentHashMap.put("english", ibzVar8);
        concurrentHashMap.put("secondary", ibzVar7);
        concurrentHashMap.put("handwriting", ibzVar10);
        concurrentHashMap.put("empty", ibzVar11);
    }

    private ibz(String str) {
        this.l = str;
    }

    public static ibz a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ltd) m.a(hip.a).k("com/google/android/libraries/inputmethod/metadata/KeyboardType", "get", 85, "KeyboardType.java")).t("name should not be empty");
            ieh.j().e(idd.KEYBOARD_TYPE_EMPTY, new RuntimeException());
        }
        String c2 = jbs.c(str);
        ConcurrentHashMap concurrentHashMap = n;
        ibz ibzVar = (ibz) concurrentHashMap.get(c2);
        if (ibzVar == null) {
            ibz ibzVar2 = new ibz(c2);
            ibz ibzVar3 = (ibz) concurrentHashMap.putIfAbsent(c2, ibzVar2);
            return ibzVar3 == null ? ibzVar2 : ibzVar3;
        }
        return ibzVar;
    }

    public final String toString() {
        return this.l;
    }
}
