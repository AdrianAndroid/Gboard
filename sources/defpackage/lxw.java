package defpackage;

import java.util.zip.Adler32;
import java.util.zip.CRC32;

/* compiled from: PG */
/* renamed from: lxw  reason: default package */
/* loaded from: classes.dex */
enum lxw implements lxz {
    CRC_32("Hashing.crc32()"),
    ADLER_32("Hashing.adler32()");
    
    public final lxu c;

    lxw(String str) {
        this.c = new lxq(this, str);
    }

    @Override // defpackage.lgb
    public final /* synthetic */ Object a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw null;
            }
            return new Adler32();
        }
        return new CRC32();
    }
}
