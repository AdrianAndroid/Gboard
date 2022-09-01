package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseActivity extends cx {
    @Override // defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.f143290_resource_name_obfuscated_res_0x7f0e0451);
        kmz kmzVar = (kmz) getIntent().getParcelableExtra("license");
        if (g() != null) {
            g().i(kmzVar.a);
            g().r();
            g().g(true);
            g().s();
        }
        TextView textView = (TextView) findViewById(R.id.f65570_resource_name_obfuscated_res_0x7f0b0776);
        long j = kmzVar.b;
        int i = kmzVar.c;
        String str2 = kmzVar.d;
        if (str2.isEmpty()) {
            str = kez.g(this, "third_party_licenses", j, i);
        } else {
            try {
                String f = kez.f(new BufferedInputStream(new FileInputStream(str2)), j, i);
                if (f != null) {
                    if (!f.isEmpty()) {
                        str = f;
                    }
                }
            } catch (FileNotFoundException unused) {
            }
            throw new RuntimeException(String.valueOf(str2).concat(" does not contain res/raw/third_party_licenses"));
        }
        if (str == null) {
            finish();
        } else {
            textView.setText(str);
        }
    }

    @Override // defpackage.ow, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.f65560_resource_name_obfuscated_res_0x7f0b0775);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new ov(this, i, scrollView, 14));
        }
    }

    @Override // defpackage.ow, defpackage.cc, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.f65560_resource_name_obfuscated_res_0x7f0b0775);
        Layout layout = ((TextView) findViewById(R.id.f65570_resource_name_obfuscated_res_0x7f0b0776)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
