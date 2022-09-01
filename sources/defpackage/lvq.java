package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lvq  reason: default package */
/* loaded from: classes.dex */
public final class lvq implements lvr {
    private final /* synthetic */ int a;

    public lvq(int i) {
        this.a = i;
    }

    public lvq(byte[] bArr, int i) {
        this.a = i;
    }

    @Override // defpackage.lvr
    public final lun a(String str) {
        return this.a != 0 ? new him(str) : new lwb(str, Level.ALL, lwc.a, lwc.b);
    }
}
