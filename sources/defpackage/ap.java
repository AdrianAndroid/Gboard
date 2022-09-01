package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: ap  reason: default package */
/* loaded from: classes.dex */
public class ap extends ow implements ty, tz {
    boolean a;
    boolean b;
    public final aqq e = new aqq((au) new ao(this));
    final afq d = new afq(this);
    boolean c = true;

    public ap() {
        J().b("android:support:lifecycle", new ax(this, 1));
        j(new cw(this, 1));
    }

    private static boolean gr(bi biVar, afp afpVar) {
        boolean z = false;
        for (an anVar : biVar.j()) {
            if (anVar != null) {
                au auVar = anVar.A;
                if ((auVar == null ? null : ((ao) auVar).a) != null) {
                    z |= gr(anVar.D(), afpVar);
                }
                bt btVar = anVar.X;
                if (btVar != null && btVar.I().a.a(afp.STARTED)) {
                    anVar.X.a.e(afpVar);
                    z = true;
                }
                if (anVar.aa.a.a(afp.STARTED)) {
                    anVar.aa.e(afpVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String concat = String.valueOf(str).concat("  ");
        printWriter.print(concat);
        printWriter.print("mCreated=");
        printWriter.print(this.a);
        printWriter.print(" mResumed=");
        printWriter.print(this.b);
        printWriter.print(" mStopped=");
        printWriter.print(this.c);
        if (getApplication() != null) {
            agu.a(this).c(concat, printWriter);
        }
        this.e.A().D(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void hA() {
        invalidateOptionsMenu();
    }

    public final bi hB() {
        return this.e.A();
    }

    final View hC(View view, String str, Context context, AttributeSet attributeSet) {
        return ((au) this.e.a).e.c.onCreateView(view, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void hD() {
        do {
        } while (gr(hB(), afp.CREATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ow, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.e.B();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.e.B();
        super.onConfigurationChanged(configuration);
        ((au) this.e.a).e.p(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ow, defpackage.cc, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.c(afo.ON_CREATE);
        ((au) this.e.a).e.q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
            aqq aqqVar = this.e;
            return onCreatePanelMenu | ((au) aqqVar.a).e.P(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View hC = hC(view, str, context, attributeSet);
        return hC == null ? super.onCreateView(view, str, context, attributeSet) : hC;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((au) this.e.a).e.r();
        this.d.c(afo.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((au) this.e.a).e.s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return ((au) this.e.a).e.Q(menuItem);
        }
        if (i == 6) {
            return ((au) this.e.a).e.O(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        ((au) this.e.a).e.t(z);
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        this.e.B();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((au) this.e.a).e.v(menu);
            i = 0;
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.b = false;
        ((au) this.e.a).e.x();
        this.d.c(afo.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        ((au) this.e.a).e.y(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.d.c(afo.ON_RESUME);
        ((au) this.e.a).e.z();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | ((au) this.e.a).e.R(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // defpackage.ow, android.app.Activity, defpackage.ty
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.B();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.e.B();
        super.onResume();
        this.b = true;
        this.e.C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.e.B();
        super.onStart();
        this.c = false;
        if (!this.a) {
            this.a = true;
            ((au) this.e.a).e.o();
        }
        this.e.C();
        this.d.c(afo.ON_START);
        ((au) this.e.a).e.A();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.c = true;
        hD();
        ((au) this.e.a).e.C();
        this.d.c(afo.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View hC = hC(null, str, context, attributeSet);
        return hC == null ? super.onCreateView(str, context, attributeSet) : hC;
    }
}
