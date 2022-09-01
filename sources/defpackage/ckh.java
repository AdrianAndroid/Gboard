package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckh  reason: default package */
/* loaded from: classes.dex */
public final class ckh extends View {
    private static final IBinder b = new ckg();
    public final int[] a = new int[2];

    public ckh(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final IBinder getWindowToken() {
        return b;
    }
}
