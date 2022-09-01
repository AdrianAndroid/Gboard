package defpackage;

import android.view.inputmethod.InputConnection;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hpp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hpp implements Callable {
    public final /* synthetic */ InputConnection a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ hpp(InputConnection inputConnection, int i, int i2, int i3) {
        this.d = i3;
        this.a = inputConnection;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d == 0) {
            InputConnection inputConnection = this.a;
            int i = this.b;
            int i2 = this.c;
            ltg ltgVar = hpr.a;
            return hpw.d(inputConnection, i, i2);
        }
        InputConnection inputConnection2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        ltg ltgVar2 = hpr.a;
        return hpw.e(inputConnection2, i3, i4);
    }
}
