package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: nip  reason: default package */
/* loaded from: classes2.dex */
public abstract class nip implements nin {
    public static long d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(lel.b));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static nin e(long j, nhf nhfVar) {
        return new nio(j, nhfVar);
    }

    @Override // defpackage.nin
    public final lfb a(ndy ndyVar, nfb nfbVar) {
        return b() == d(ndyVar.a) ? lfb.g(c().e(ndyVar.b, nfbVar)) : ldu.a;
    }

    public abstract long b();

    public abstract nhf c();
}
