package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ikv  reason: default package */
/* loaded from: classes.dex */
public abstract class ikv extends an {
    public AppCompatEditText a;
    private ika b;
    private AppCompatEditText c;

    private final void m() {
        AppCompatEditText appCompatEditText;
        InputMethodManager inputMethodManager = (InputMethodManager) B().getSystemService("input_method");
        if (inputMethodManager == null || (appCompatEditText = this.c) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(appCompatEditText.getWindowToken(), 2);
    }

    @Override // defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f143990_resource_name_obfuscated_res_0x7f0e04af, viewGroup, false);
        this.c = (AppCompatEditText) inflate.findViewById(R.id.f67160_resource_name_obfuscated_res_0x7f0b083f);
        this.a = (AppCompatEditText) inflate.findViewById(R.id.f67140_resource_name_obfuscated_res_0x7f0b083d);
        View findViewById = inflate.findViewById(R.id.f67150_resource_name_obfuscated_res_0x7f0b083e);
        if (findViewById != null) {
            findViewById.setOnClickListener(new hwd(this, 5));
        }
        return inflate;
    }

    @Override // defpackage.an
    public final void O(Bundle bundle) {
        super.O(bundle);
        if (bundle != null) {
            this.b = new ika(bundle);
        } else {
            this.b = new ika(this.m);
        }
        this.c.setText(this.b.b);
        AppCompatEditText appCompatEditText = this.c;
        appCompatEditText.setSelection(appCompatEditText.mo22getText().length());
        this.a.setText(this.b.c);
    }

    @Override // defpackage.an
    public final void Q(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.f147150_resource_name_obfuscated_res_0x7f100005, menu);
        jbt.z(B(), menu);
    }

    @Override // defpackage.an
    public final void T() {
        AppCompatEditText appCompatEditText;
        long a;
        mcy mcyVar;
        ika ikaVar = this.b;
        if (ikaVar != null && (appCompatEditText = this.c) != null && this.a != null) {
            Editable mo22getText = appCompatEditText.mo22getText();
            String str = "";
            String obj = mo22getText != null ? mo22getText.toString() : str;
            Editable mo22getText2 = this.a.mo22getText();
            if (mo22getText2 != null) {
                str = mo22getText2.toString();
            }
            String str2 = str;
            if (!ikaVar.b.equals(obj) || !ikaVar.c.equals(str2)) {
                if (TextUtils.isEmpty(obj)) {
                    a().b(B(), ikaVar);
                    mcyVar = mcy.DELETE;
                    a = -1;
                } else {
                    a = a().a(B(), ikaVar, obj, str2);
                    mcyVar = mcy.EDIT;
                }
                this.b = new ika(a, obj, str2, ikaVar.d);
                an z = z();
                if (z != null) {
                    z.P(fR(), -1, new Intent().putExtra("EXTRA_KEY_UPDATE_TYPE", mcyVar.d));
                }
            }
        }
        m();
        super.T();
    }

    @Override // defpackage.an
    public final void U() {
        super.U();
        AppCompatEditText appCompatEditText = this.c;
        if (appCompatEditText != null) {
            appCompatEditText.sendAccessibilityEvent(8);
        }
    }

    protected abstract iku a();

    @Override // defpackage.an
    public final boolean al(MenuItem menuItem) {
        m();
        ika ikaVar = this.b;
        if (menuItem.getItemId() != R.id.f52120_resource_name_obfuscated_res_0x7f0b0051 || ikaVar == null) {
            return false;
        }
        a().b(B(), ikaVar);
        this.b = null;
        an z = z();
        if (z != null) {
            z.P(fR(), -1, new Intent().putExtra("EXTRA_KEY_UPDATE_TYPE", mcy.DELETE.d));
        }
        B().onBackPressed();
        return true;
    }

    @Override // defpackage.an
    public final void e(Bundle bundle) {
        super.e(bundle);
        as();
    }

    @Override // defpackage.an
    public final void f() {
        m();
        super.f();
    }

    @Override // defpackage.an
    public final void h(Bundle bundle) {
        ika ikaVar = this.b;
        if (ikaVar != null) {
            ikaVar.a(bundle);
        }
    }
}
