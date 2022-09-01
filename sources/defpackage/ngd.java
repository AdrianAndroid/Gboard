package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ngd  reason: default package */
/* loaded from: classes2.dex */
public class ngd extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public ngd(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static ngc a() {
        return new ngc();
    }

    public static ngd b() {
        return new ngd("Protocol message end-group tag did not match expected tag.");
    }

    public static ngd c() {
        return new ngd("Protocol message contained an invalid tag (zero).");
    }

    public static ngd d() {
        return new ngd("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ngd e() {
        return new ngd("CodedInputStream encountered a malformed varint.");
    }

    public static ngd f() {
        return new ngd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ngd g() {
        return new ngd("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ngd h() {
        return new ngd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static ngd i() {
        return new ngd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.a = true;
    }

    public ngd(String str) {
        super(str);
    }

    public ngd(IOException iOException, byte[] bArr) {
        super("Unable to decode to byte array", iOException);
    }
}
