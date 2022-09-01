package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lye  reason: default package */
/* loaded from: classes.dex */
public final class lye extends lxm implements Serializable {
    static final lxu a = new lye();
    private static final long serialVersionUID = 0;
    private final int b = 0;

    static {
        int i = lxy.a;
    }

    @Override // defpackage.lxu
    public final lxv b() {
        return new lyd();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lye) {
            int i = ((lye) obj).b;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
