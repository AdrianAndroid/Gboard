package defpackage;

/* compiled from: PG */
/* renamed from: jkr  reason: default package */
/* loaded from: classes.dex */
public enum jkr {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);
    
    public final int d;

    jkr(int i) {
        this.d = i;
    }

    public static jkr a(int i) {
        if (i != 0) {
            if (i == 1) {
                return ADD_DOWNLOAD_TRANSFORM;
            }
            if (i == 2) {
                return USE_CHECKSUM_ONLY;
            }
            throw new IllegalArgumentException("Unknown MDD FileKey version:" + i);
        }
        return NEW_FILE_KEY;
    }
}
