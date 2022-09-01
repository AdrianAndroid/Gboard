package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bfu  reason: default package */
/* loaded from: classes.dex */
public final class bfu implements auw {
    private final Object b;

    public bfu(Object obj) {
        ce.m(obj);
        this.b = obj;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof bfu) {
            return this.b.equals(((bfu) obj).b);
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        return "ObjectKey{object=" + obj + "}";
    }
}
