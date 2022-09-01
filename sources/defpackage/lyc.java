package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: lyc  reason: default package */
/* loaded from: classes.dex */
final class lyc extends lxm implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d = "Hashing.sha256()";

    public lyc(String str, int i) {
        MessageDigest c = c(str);
        this.a = c;
        int digestLength = c.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        jdg.B(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = d(c);
    }

    private static MessageDigest c(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean d(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.lxu
    public final lxv b() {
        if (this.c) {
            try {
                return new lya((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new lya(c(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new lyb(this.a.getAlgorithm(), this.b);
    }

    public lyc() {
        MessageDigest c = c("SHA-256");
        this.a = c;
        this.b = c.getDigestLength();
        this.c = d(c);
    }
}
