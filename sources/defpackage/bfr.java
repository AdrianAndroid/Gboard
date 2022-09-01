package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bfr  reason: default package */
/* loaded from: classes.dex */
public final class bfr implements auw {
    public static final /* synthetic */ int b = 0;
    private final int c;
    private final auw d;

    public bfr(int i, auw auwVar) {
        this.c = i;
        this.d = auwVar;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof bfr) {
            bfr bfrVar = (bfr) obj;
            if (this.c == bfrVar.c && this.d.equals(bfrVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return bgj.f(this.d, this.c);
    }
}
