package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bjz  reason: default package */
/* loaded from: classes.dex */
final class bjz {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap(13);
        a = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        hashMap.put("bolder", 1);
        hashMap.put("lighter", -1);
        hashMap.put("100", 100);
        hashMap.put("200", 200);
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        hashMap.put("500", 500);
        hashMap.put("600", 600);
        hashMap.put("700", 700);
        hashMap.put("800", 800);
        hashMap.put("900", 900);
    }

    public static Integer a(String str) {
        return (Integer) a.get(str);
    }
}
