package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: cc  reason: default package */
/* loaded from: classes.dex */
public class cc extends Activity implements afv, yp {
    private final afq fb = new afq(this);

    public cc() {
        new qv();
    }

    @Override // defpackage.afv
    public afq I() {
        return this.fb;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !aad.ac(decorView, keyEvent)) {
            return yq.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !aad.ac(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // defpackage.yp
    public final boolean hE(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        agk.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        afq afqVar = this.fb;
        afp afpVar = afp.CREATED;
        afq.f("markState");
        afqVar.e(afpVar);
        super.onSaveInstanceState(bundle);
    }
}
