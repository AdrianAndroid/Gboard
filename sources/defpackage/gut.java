package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.appcompat.ExpandableAppBarLayoutBehavior;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: PG */
/* renamed from: gut  reason: default package */
/* loaded from: classes.dex */
public class gut extends cx implements MenuItem.OnActionExpandListener, hah, guu {
    private gur k;
    private CollapsingToolbarLayout l;
    public Toolbar m;
    public ProgressBar n;
    public ViewGroup o;
    private ViewGroup p;
    private int q = 0;
    private cd r;

    private static int m(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    private final void p(boolean z) {
        gur gurVar = this.k;
        if (gurVar != null) {
            ExpandableAppBarLayoutBehavior expandableAppBarLayoutBehavior = (ExpandableAppBarLayoutBehavior) ((tr) gurVar.a.getLayoutParams()).a;
            AppBarLayout appBarLayout = gurVar.a;
            if (expandableAppBarLayoutBehavior.b == z) {
                return;
            }
            if (z) {
                appBarLayout.i(expandableAppBarLayoutBehavior.a, false);
            } else {
                expandableAppBarLayoutBehavior.a = gur.C(appBarLayout);
                appBarLayout.i(false, false);
            }
            expandableAppBarLayoutBehavior.b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cx, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(new ContextThemeWrapper(context, (int) R.style.f192500_resource_name_obfuscated_res_0x7f150243));
    }

    @Override // defpackage.hah
    public final void gb() {
        hqs.f(this.o, this);
    }

    public /* synthetic */ int l() {
        return 0;
    }

    public /* synthetic */ Integer o(int i) {
        return null;
    }

    @Override // defpackage.ow, android.app.Activity
    public void onBackPressed() {
        bi hB = hB();
        if (hB.a() <= 1) {
            finishAfterTransition();
        } else {
            hB.V();
        }
    }

    @Override // defpackage.cx, defpackage.ap, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int m;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT < 28 || (m = m(configuration)) == this.q) {
            return;
        }
        this.q = m;
        gcl.h(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (guv.a()) {
            setTheme(R.style.f193000_resource_name_obfuscated_res_0x7f15027e);
        } else {
            setTheme(2132083192);
        }
        jgx.b(this, jgx.a);
        super.onCreate(bundle);
        bi hB = hB();
        super.setContentView(R.layout.f133480_resource_name_obfuscated_res_0x7f0e0025);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.f52460_resource_name_obfuscated_res_0x7f0b0087);
        this.k = new gur(appBarLayout);
        this.l = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.f53490_resource_name_obfuscated_res_0x7f0b0122);
        if (guv.a()) {
            float dimension = getResources().getDimension(R.dimen.f33910_resource_name_obfuscated_res_0x7f07016f);
            CollapsingToolbarLayout collapsingToolbarLayout = this.l;
            collapsingToolbarLayout.a = (int) dimension;
            collapsingToolbarLayout.requestLayout();
        }
        Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.f52050_resource_name_obfuscated_res_0x7f0b0048);
        dr drVar = (dr) h();
        if (drVar.k instanceof Activity) {
            cm b = drVar.b();
            if (b instanceof eh) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            drVar.p = null;
            if (b != null) {
                b.e();
            }
            drVar.o = null;
            if (toolbar != null) {
                eb ebVar = new eb(toolbar, drVar.D(), drVar.n);
                drVar.o = ebVar;
                drVar.n.d = ebVar.d;
            } else {
                drVar.n.d = null;
            }
            drVar.g();
        }
        hB.ab(this.k);
        this.m = (Toolbar) findViewById(R.id.f52050_resource_name_obfuscated_res_0x7f0b0048);
        this.n = (ProgressBar) findViewById(R.id.f67630_resource_name_obfuscated_res_0x7f0b087e);
        this.p = (ViewGroup) findViewById(R.id.f53570_resource_name_obfuscated_res_0x7f0b012b);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.f52670_resource_name_obfuscated_res_0x7f0b00bb);
        this.o = viewGroup;
        viewGroup.setVisibility(8);
        gus gusVar = new gus(this);
        this.r = gusVar;
        hB.ab(gusVar);
        cm g = g();
        if (g != null) {
            g.g(true);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = m(getResources().getConfiguration());
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        p(true);
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        p(false);
        return true;
    }

    @Override // defpackage.ow, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected final bq s(an anVar) {
        bq i = hB().i();
        i.t(R.id.f53570_resource_name_obfuscated_res_0x7f0b012b, anVar);
        i.p();
        return i;
    }

    @Override // defpackage.cx, defpackage.ow, android.app.Activity
    public final void setContentView(int i) {
        this.p.removeAllViews();
        if (i != 0) {
            LayoutInflater.from(this).inflate(i, this.p);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        this.l.e(charSequence);
        super.setTitle(charSequence);
    }

    @Override // defpackage.guu
    public final View t(int i) {
        return this.o.findViewById(i);
    }

    @Override // defpackage.guu
    public final void u(int i) {
        this.o.removeAllViews();
        if (i != 0) {
            this.o.setVisibility(0);
            LayoutInflater.from(this).inflate(i, this.o);
            return;
        }
        this.o.setVisibility(8);
    }

    public final void v(boolean z) {
        ProgressBar progressBar = this.n;
        if (progressBar != null) {
            progressBar.setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // defpackage.guu
    public final void w(an anVar, CharSequence charSequence) {
        bq s = s(anVar);
        s.r(charSequence);
        s.j();
    }

    @Override // defpackage.guu
    public final void x(String str, Bundle bundle, int i, CharSequence charSequence, an anVar) {
        an A = an.A(this, str, bundle);
        if (anVar != null) {
            A.ae(anVar, 0);
        }
        bq s = s(A);
        if (i != 0) {
            s.m = i;
            s.n = null;
        } else if (charSequence != null) {
            s.r(charSequence);
        }
        s.j();
    }
}
