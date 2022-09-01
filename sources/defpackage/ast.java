package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ast  reason: default package */
/* loaded from: classes.dex */
public final class ast implements ass {
    private final FileChannel a;
    private final long b;
    private final long c;

    public ast(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.ass
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ass
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
