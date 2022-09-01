package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nsy  reason: default package */
/* loaded from: classes2.dex */
public final class nsy {
    static final lex a = lex.c(',');
    public static final nsy b = b().c(new nsh(1), true).c(nsh.a, false);
    public final byte[] c;
    private final Map d;

    private nsy() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    public static nsy b() {
        return new nsy();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [nsw, java.lang.Object] */
    public final nsw a(String str) {
        nsx nsxVar = (nsx) this.d.get(str);
        if (nsxVar != null) {
            return nsxVar.b;
        }
        return null;
    }

    public final nsy c(nsw nswVar, boolean z) {
        return new nsy(nswVar, z, this);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [nsw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [nsw, java.lang.Object] */
    private nsy(nsw nswVar, boolean z, nsy nsyVar) {
        String b2 = nswVar.b();
        jdg.w(!b2.contains(","), "Comma is currently not allowed in message encoding");
        int size = nsyVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!nsyVar.d.containsKey(nswVar.b()) ? size + 1 : size);
        for (nsx nsxVar : nsyVar.d.values()) {
            String b3 = nsxVar.b.b();
            if (!b3.equals(b2)) {
                linkedHashMap.put(b3, new nsx((nsw) nsxVar.b, nsxVar.a));
            }
        }
        linkedHashMap.put(b2, new nsx(nswVar, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.d = unmodifiableMap;
        lex lexVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((nsx) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = lexVar.f(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
