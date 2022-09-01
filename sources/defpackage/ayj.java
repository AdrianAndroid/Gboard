package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ayj  reason: default package */
/* loaded from: classes.dex */
public final class ayj implements bgm {
    private final /* synthetic */ int a;

    public ayj(int i) {
        this.a = i;
    }

    public static final ayk b() {
        try {
            return new ayk(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.bgm
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? new ArrayList() : new axg();
        }
        return b();
    }
}
