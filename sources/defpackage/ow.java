package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ow */
/* loaded from: classes2.dex */
public class ow extends cc implements afv, agq, ajc, pa, AbstractC0079pg {
    private aqr a;
    public final afq h;
    final bdz i;
    public final pb f = new pb();
    private final aqq b = new aqq((byte[]) null, (char[]) null);
    public final bek j = new bek(new od(this, 3));
    public final pf g = new pf(this);

    public ow() {
        afq afqVar = new afq(this);
        this.h = afqVar;
        bdz g = bdz.g(this);
        this.i = g;
        new AtomicInteger();
        afqVar.b(new aft() { // from class: androidx.activity.ComponentActivity$3
            @Override // defpackage.aft
            public final void hS(afv afvVar, afo afoVar) {
                if (afoVar == afo.ON_STOP) {
                    Window window = ow.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView == null) {
                        return;
                    }
                    peekDecorView.cancelPendingInputEvents();
                }
            }
        });
        afqVar.b(new aft() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.aft
            public final void hS(afv afvVar, afo afoVar) {
                if (afoVar == afo.ON_DESTROY) {
                    ow.this.f.b = null;
                    if (ow.this.isChangingConfigurations()) {
                        return;
                    }
                    ow.this.at().m();
                }
            }
        });
        afqVar.b(new aft() { // from class: androidx.activity.ComponentActivity$5
            @Override // defpackage.aft
            public final void hS(afv afvVar, afo afoVar) {
                ow.this.k();
                ow.this.h.d(this);
            }
        });
        g.d();
        if (Build.VERSION.SDK_INT <= 23) {
            afqVar.b(new ImmLeaksCleaner(this));
        }
        J().b("android:support:activity-result", new ax(this, 3));
        j(new cw(this, 2));
    }

    private void a() {
        vl.b(getWindow().getDecorView(), this);
        vp.b(getWindow().getDecorView(), this);
        vr.b(getWindow().getDecorView(), this);
        fw.c(getWindow().getDecorView(), this);
    }

    @Override // defpackage.cc, defpackage.afv
    public final afq I() {
        return this.h;
    }

    @Override // defpackage.ajc
    public final ajb J() {
        return (ajb) this.i.b;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.agq
    public final aqr at() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        k();
        return this.a;
    }

    public final void j(pc pcVar) {
        pb pbVar = this.f;
        if (pbVar.b != null) {
            Context context = pbVar.b;
            pcVar.a();
        }
        pbVar.a.add(pcVar);
    }

    public final void k() {
        if (this.a == null) {
            oir oirVar = (oir) getLastNonConfigurationInstance();
            if (oirVar != null) {
                this.a = (aqr) oirVar.a;
            }
            if (this.a != null) {
                return;
            }
            this.a = new aqr((byte[]) null, (char[]) null);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.g.b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.j.o();
    }

    @Override // defpackage.cc, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.e(bundle);
        pb pbVar = this.f;
        pbVar.b = this;
        for (pc pcVar : pbVar.a) {
            pcVar.a();
        }
        super.onCreate(bundle);
        agk.b(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        aqq aqqVar = this.b;
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) aqqVar.a).iterator();
        while (it.hasNext()) {
            ((yt) it.next()).a();
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.b.n();
    }

    @Override // android.app.Activity, defpackage.ty
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.g.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        oir oirVar;
        Object obj = this.a;
        if (obj == null && (oirVar = (oir) getLastNonConfigurationInstance()) != null) {
            obj = oirVar.a;
        }
        if (obj == null) {
            return null;
        }
        oir oirVar2 = new oir(null, null);
        oirVar2.a = obj;
        return oirVar2;
    }

    @Override // defpackage.cc, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        afq afqVar = this.h;
        if (afqVar instanceof afq) {
            afqVar.e(afp.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.i.f(bundle);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        aju.a();
        super.reportFullyDrawn();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        a();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        a();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a();
        super.setContentView(view, layoutParams);
    }
}
