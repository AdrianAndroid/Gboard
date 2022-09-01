package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: nvo  reason: default package */
/* loaded from: classes2.dex */
public final class nvo {
    public final String a;
    public final Collection b;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection, java.lang.Object] */
    public nvo(oqv oqvVar, byte[] bArr, byte[] bArr2) {
        String str = (String) oqvVar.a;
        this.a = str;
        ?? r8 = oqvVar.b;
        HashSet hashSet = new HashSet(r8.size());
        for (nuq nuqVar : r8) {
            jdg.Q(nuqVar, "method");
            String str2 = nuqVar.c;
            jdg.D(str.equals(str2), "service names %s != %s", str2, str);
            jdg.A(hashSet.add(nuqVar.b), "duplicate name %s", nuqVar.b);
        }
        this.b = Collections.unmodifiableList(new ArrayList((Collection) oqvVar.b));
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("name", this.a);
        S.b("schemaDescriptor", null);
        S.b("methods", this.b);
        S.d();
        return S.toString();
    }
}
