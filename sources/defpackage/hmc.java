package defpackage;

import android.view.inputmethod.InputConnection;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hmc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hmc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hmc(InputConnection inputConnection, int i, int i2) {
        this.c = i2;
        this.b = inputConnection;
        this.a = i;
    }

    public /* synthetic */ hmc(hmd hmdVar, int i, int i2) {
        this.c = i2;
        this.b = hmdVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            Object obj = this.b;
            return ((hmd) obj).a.j(this.a);
        } else if (i == 1) {
            Object obj2 = this.b;
            return ((hmd) obj2).a.i(this.a);
        } else if (i == 2) {
            ?? r0 = this.b;
            int i2 = this.a;
            ltg ltgVar = hpr.a;
            hpw.a.b("getCursorCapsMode(%d)", Integer.valueOf(i2));
            return Integer.valueOf(r0.getCursorCapsMode(i2));
        } else if (i == 3) {
            ?? r02 = this.b;
            int i3 = this.a;
            ltg ltgVar2 = hpr.a;
            hpw.a.b("requestCursorUpdates(%d)", Integer.valueOf(i3));
            return Boolean.valueOf(r02.requestCursorUpdates(i3));
        } else if (i == 4) {
            ?? r03 = this.b;
            int i4 = this.a;
            ltg ltgVar3 = hpr.a;
            hpw.a.b("clearMetaKeyStates(%d)", Integer.valueOf(i4));
            return Boolean.valueOf(r03.clearMetaKeyStates(i4));
        } else {
            ?? r04 = this.b;
            int i5 = this.a;
            ltg ltgVar4 = hpr.a;
            return hpw.c(r04, i5);
        }
    }
}
