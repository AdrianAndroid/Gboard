package com.google.android.apps.inputmethod.libs.swissarmyknife;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DecoderStateReportActivity extends gut {
    public static final /* synthetic */ int k = 0;
    private static final ltg l = ltg.j("com/google/android/apps/inputmethod/libs/swissarmyknife/DecoderStateReportActivity");
    private ClipData p;
    private final guh q = new epa();

    private final String m() {
        return !((RadioButton) findViewById(R.id.f130380_resource_name_obfuscated_res_0x7f0b21df)).isChecked() ? "" : ((EditText) findViewById(R.id.f54450_resource_name_obfuscated_res_0x7f0b01a3)).getText().toString();
    }

    private final String p() {
        return ((EditText) findViewById(R.id.f52710_resource_name_obfuscated_res_0x7f0b00c2)).getText().toString();
    }

    private final void q(int i) {
        Toast.makeText(this, getString(i), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, defpackage.ow, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            finishAndRemoveTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gut, defpackage.ap, defpackage.ow, defpackage.cc, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ClipData clipData = getIntent().getClipData();
        this.p = clipData;
        if (clipData == null) {
            q(R.string.f176630_resource_name_obfuscated_res_0x7f140cea);
            finishAndRemoveTask();
            return;
        }
        cm g = g();
        if (g != null) {
            g.g(true);
            g.t();
        }
        setContentView(R.layout.f133900_resource_name_obfuscated_res_0x7f0e005e);
        LinkableTextView linkableTextView = (LinkableTextView) findViewById(R.id.f128870_resource_name_obfuscated_res_0x7f0b2110);
        if (linkableTextView != null) {
            linkableTextView.a = new bwd(this, 5);
        }
        ((RadioGroup) findViewById(R.id.f68310_resource_name_obfuscated_res_0x7f0b08db)).setOnCheckedChangeListener(new epb(this));
        this.q.e();
    }

    @Override // defpackage.ow, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f147130_resource_name_obfuscated_res_0x7f100003, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cx, defpackage.ap, android.app.Activity
    public final void onDestroy() {
        this.q.f();
        super.onDestroy();
    }

    @Override // defpackage.gut, defpackage.ow, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.f129230_resource_name_obfuscated_res_0x7f0b2142) {
            RadioButton radioButton = (RadioButton) findViewById(R.id.f53660_resource_name_obfuscated_res_0x7f0b0138);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.f130380_resource_name_obfuscated_res_0x7f0b21df);
            if (radioButton.isChecked() || radioButton2.isChecked()) {
                if (!radioButton.isChecked() || !p().isEmpty()) {
                    if (!radioButton2.isChecked() || !m().isEmpty()) {
                        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                        intent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmailExternal");
                        String m = m();
                        String str = "buganizer-system+941620@google.com";
                        if (!m.isEmpty()) {
                            str = str + m + "@google.com";
                        }
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                        intent.putExtra("android.intent.extra.SUBJECT", p());
                        StringBuilder sb = new StringBuilder();
                        sb.append(((EditText) findViewById(R.id.f52690_resource_name_obfuscated_res_0x7f0b00c0)).getText().toString());
                        sb.append("\n\nGboard version name: ");
                        nfh t = myk.e.t();
                        try {
                            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                            String str2 = packageInfo.versionName;
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            myk mykVar = (myk) t.b;
                            str2.getClass();
                            mykVar.a |= 1;
                            mykVar.b = str2;
                            int i = packageInfo.versionCode;
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            myk mykVar2 = (myk) t.b;
                            mykVar2.a |= 2;
                            mykVar2.c = i;
                        } catch (PackageManager.NameNotFoundException e) {
                            ((ltd) ((ltd) l.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/swissarmyknife/DecoderStateReportActivity", "buildAppInformation", 199, "DecoderStateReportActivity.java")).t("Failed to get package info.");
                        }
                        String u = efq.u(getApplicationContext());
                        if (u != null) {
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            myk mykVar3 = (myk) t.b;
                            mykVar3.a |= 4;
                            mykVar3.d = u;
                        }
                        myk mykVar4 = (myk) t.cz();
                        nfh t2 = myl.d.t();
                        String str3 = Build.MODEL;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        myl mylVar = (myl) t2.b;
                        str3.getClass();
                        mylVar.a |= 1;
                        mylVar.b = str3;
                        String str4 = Build.VERSION.RELEASE;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        myl mylVar2 = (myl) t2.b;
                        str4.getClass();
                        mylVar2.a |= 2;
                        mylVar2.c = str4;
                        myl mylVar3 = (myl) t2.cz();
                        sb.append(mykVar4.b);
                        sb.append("\nGboard version code: ");
                        sb.append(mykVar4.c);
                        sb.append("\nGboard main LM: ");
                        sb.append(mykVar4.d);
                        sb.append("\n\n\nDevice model: ");
                        sb.append(mylVar3.b);
                        sb.append("\nDevice version: ");
                        sb.append(mylVar3.c);
                        sb.append("\n\n");
                        intent.putExtra("android.intent.extra.TEXT", sb.toString());
                        ArrayList arrayList = new ArrayList();
                        if (this.p != null) {
                            for (int i2 = 0; i2 < this.p.getItemCount(); i2++) {
                                arrayList.add(this.p.getItemAt(i2).getUri());
                            }
                        }
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(arrayList));
                        intent.addFlags(1);
                        startActivityForResult(Intent.createChooser(intent, "Send email..."), 1);
                    } else {
                        q(R.string.f176640_resource_name_obfuscated_res_0x7f140ceb);
                    }
                } else {
                    q(R.string.f176650_resource_name_obfuscated_res_0x7f140cec);
                }
            } else {
                q(R.string.f176620_resource_name_obfuscated_res_0x7f140ce9);
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
