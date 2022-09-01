package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: dxz  reason: default package */
/* loaded from: classes.dex */
public class dxz extends inx implements inb, ty {
    public Menu k;
    public ine l;
    private int p;
    private boolean r;
    private final idk q = ieh.j();
    private final ArrayList s = new ArrayList();
    private final boolean t = true;

    @Override // defpackage.gut, defpackage.ow, android.app.Activity
    public final void onBackPressed() {
        ine ineVar = this.l;
        if (ineVar == null || !ineVar.aG()) {
            super.onBackPressed();
            if (isFinishing()) {
                this.r = true;
            } else if (hB().a() != 1) {
            } else {
                r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.inx, defpackage.gut, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (this.t) {
            p(this.s);
        }
        super.onCreate(bundle);
        this.p = getIntent().getIntExtra("entry", 0);
        this.q.e(dda.SETTINGS_ACTIVITY_CREATED, Integer.valueOf(this.p));
    }

    @Override // defpackage.ow, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.k = menu;
        r();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onDestroy() {
        this.s.clear();
        super.onDestroy();
    }

    @Override // defpackage.gut, defpackage.ow, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.f52190_resource_name_obfuscated_res_0x7f0b005f || itemId != R.id.f52030_resource_name_obfuscated_res_0x7f0b0044) {
            return super.onOptionsItemSelected(menuItem);
        }
        Bundle bundle = new Bundle();
        bundle.putString("PREFERENCE_FRAGMENT", "setting_about");
        z(CommonPreferenceFragment.class.getName(), bundle, menuItem.getTitle());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.r && ing.a.contains(Integer.valueOf(this.p))) {
            hsv.b();
        }
        this.r = false;
    }

    @Override // defpackage.ap, defpackage.ow, android.app.Activity, defpackage.ty
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ijt.e(this).j(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!li.e()) {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onStart() {
        super.onStart();
        ijt e = ijt.e(this);
        e.h(this);
        e.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onStop() {
        ijt.e(this).i(this);
        this.q.e(dda.SETTINGS_ACTIVITY_FINISHED, new Object[0]);
        super.onStop();
    }

    public void p(Collection collection) {
        throw null;
    }

    @Override // defpackage.inb
    public final void q(ini iniVar) {
        Context applicationContext = getApplicationContext();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((inj) arrayList.get(i)).a(applicationContext, iniVar);
        }
    }

    public final void r() {
        Menu menu = this.k;
        if (menu != null) {
            menu.clear();
            getMenuInflater().inflate(R.menu.f147170_resource_name_obfuscated_res_0x7f100007, this.k);
        }
    }
}
