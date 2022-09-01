package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: lbb  reason: default package */
/* loaded from: classes.dex */
public final class lbb {
    public final List a;
    public final List b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.lang.Object] */
    public lbb(jma jmaVar, byte[] bArr) {
        this.a = new ArrayList((Collection) jmaVar.b);
        this.b = new ArrayList((Collection) jmaVar.a);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
