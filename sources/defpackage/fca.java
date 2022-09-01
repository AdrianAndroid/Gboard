package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fca  reason: default package */
/* loaded from: classes.dex */
public final class fca {
    public final Context a;
    public final Executor b;
    public volatile fey c;
    public final opu d;

    public fca(Context context, opu opuVar, byte[] bArr, byte[] bArr2) {
        gyc gycVar = gyc.a;
        this.a = context;
        this.d = opuVar;
        this.b = gycVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.execute(new fal(this, 20));
    }
}
