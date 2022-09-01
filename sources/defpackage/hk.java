package defpackage;

import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.EditTextOnKeyboard;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hk  reason: default package */
/* loaded from: classes.dex */
public final class hk implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hk(AlertDialog alertDialog, int i) {
        this.b = i;
        this.a = alertDialog;
    }

    public hk(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    public hk(Toolbar toolbar, int i) {
        this.b = i;
        this.a = toolbar;
    }

    public /* synthetic */ hk(View view, int i) {
        this.b = i;
        this.a = view;
    }

    public hk(Preference preference, int i) {
        this.b = i;
        this.a = preference;
    }

    public /* synthetic */ hk(bqn bqnVar, int i) {
        this.b = i;
        this.a = bqnVar;
    }

    public /* synthetic */ hk(bud budVar, int i) {
        this.b = i;
        this.a = budVar;
    }

    public /* synthetic */ hk(bwr bwrVar, int i) {
        this.b = i;
        this.a = bwrVar;
    }

    public /* synthetic */ hk(cfz cfzVar, int i) {
        this.b = i;
        this.a = cfzVar;
    }

    public /* synthetic */ hk(MainSwitchPreference mainSwitchPreference, int i) {
        this.b = i;
        this.a = mainSwitchPreference;
    }

    public hk(ct ctVar, int i) {
        this.b = i;
        this.a = ctVar;
    }

    public hk(fm fmVar, int i) {
        this.b = i;
        this.a = fmVar;
    }

    public /* synthetic */ hk(hsk hskVar, int i) {
        this.b = i;
        this.a = hskVar;
    }

    public /* synthetic */ hk(nzv nzvVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = i;
        this.a = nzvVar;
    }

    public /* synthetic */ hk(ovg ovgVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ovgVar;
    }

    /* JADX WARN: Type inference failed for: r10v28, types: [hsk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [bwu, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        String str = "";
        Message message4 = null;
        switch (this.b) {
            case 0:
                ((fm) this.a).f();
                return;
            case 1:
                ct ctVar = (ct) this.a;
                if (view == ctVar.j && (message3 = ctVar.l) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == ctVar.m && (message2 = ctVar.o) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == ctVar.p && (message = ctVar.r) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                ct ctVar2 = (ct) this.a;
                ctVar2.I.obtainMessage(1, ctVar2.b).sendToTarget();
                return;
            case 2:
                SearchView searchView = (SearchView) this.a;
                if (view == searchView.c) {
                    searchView.g();
                    return;
                } else if (view != searchView.e) {
                    if (view == searchView.d) {
                        searchView.h();
                        return;
                    } else if (view == searchView.i || view != searchView.a) {
                        return;
                    } else {
                        searchView.c();
                        return;
                    }
                } else if (!TextUtils.isEmpty(searchView.a.getText())) {
                    searchView.a.setText(str);
                    searchView.a.requestFocus();
                    searchView.a.c(true);
                    return;
                } else if (!searchView.l) {
                    return;
                } else {
                    searchView.clearFocus();
                    searchView.t(true);
                    return;
                }
            case 3:
                ((Toolbar) this.a).i();
                return;
            case 4:
                ((Preference) this.a).hq(view);
                return;
            case 5:
                Object obj = this.a;
                ((Preference) obj).U(Boolean.valueOf(((TwoStatePreference) obj).a));
                return;
            case 6:
                Object obj2 = this.a;
                ltg ltgVar = LatinPrimeKeyboard.c;
                ((AlertDialog) obj2).cancel();
                return;
            case 7:
                bqn bqnVar = (bqn) this.a;
                dfl.a(bqnVar.l, true, bqnVar.b);
                bqnVar.a.run();
                bqnVar.c();
                return;
            case 8:
                bqn bqnVar2 = (bqn) this.a;
                dfl.a(bqnVar2.l, false, bqnVar2.b);
                bqnVar2.c();
                return;
            case 9:
                nzv nzvVar = (nzv) this.a;
                nzvVar.l();
                if (nzvVar.c == null) {
                    return;
                }
                bsi.g();
                return;
            case 10:
                this.a.at(hfd.d(new iay(-10018, null, null)));
                return;
            case 11:
                Object obj3 = this.a;
                bwg.d(view);
                bud budVar = (bud) obj3;
                EditTextOnKeyboard editTextOnKeyboard = budVar.c;
                if (editTextOnKeyboard == null) {
                    return;
                }
                Editable mo22getText = editTextOnKeyboard.mo22getText();
                if (mo22getText != null) {
                    str = mo22getText;
                }
                if (TextUtils.isEmpty(str)) {
                    ker.p(budVar.k, R.string.f147900_resource_name_obfuscated_res_0x7f140043, new Object[0]);
                    return;
                }
                bvt bvtVar = (bvt) budVar.b;
                gjz gjzVar = bvtVar.g;
                long currentTimeMillis = System.currentTimeMillis();
                if (!TextUtils.isEmpty(str)) {
                    buj g = buk.g();
                    g.a = currentTimeMillis;
                    g.e(str.toString());
                    g.d(1);
                    g.b = currentTimeMillis;
                    bvtVar.e = g.a();
                }
                budVar.g();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj4 = this.a;
                bwg.d(view);
                ((bud) obj4).g();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                bwf.b(view, (View) this.a);
                ieh.j().e(bwa.SCREENSHOT_EVENT, 2);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((imo) this.a).m();
                return;
            case 15:
                Object obj5 = this.a;
                bwr bwrVar = (bwr) obj5;
                if (bwrVar.i > 0 && SystemClock.elapsedRealtime() - bwrVar.i < 1000) {
                    return;
                }
                bwrVar.i = SystemClock.elapsedRealtime();
                AnimatorSet animatorSet = bwrVar.g;
                if (animatorSet != null) {
                    animatorSet.addListener(new bwm(bwrVar));
                }
                ((imo) obj5).m();
                if (animatorSet == null) {
                    bwrVar.j.m(bwrVar.a, bwrVar.b);
                }
                bwg.d(view);
                return;
            case 16:
                Object obj6 = this.a;
                ((imo) obj6).m();
                bwr bwrVar2 = (bwr) obj6;
                bwrVar2.j.j(bwrVar2.a, false);
                bwg.d(view);
                return;
            case 17:
                Object obj7 = this.a;
                bwr bwrVar3 = (bwr) obj7;
                if (bwrVar3.h > 0 && SystemClock.elapsedRealtime() - bwrVar3.h < 1000) {
                    return;
                }
                bwrVar3.h = SystemClock.elapsedRealtime();
                AnimatorSet animatorSet2 = bwrVar3.g;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new bwl(bwrVar3));
                }
                ((imo) obj7).m();
                if (animatorSet2 == null) {
                    bwrVar3.j.G(bwrVar3.a, bwrVar3.b);
                }
                bwg.d(view);
                return;
            case 18:
                ovg ovgVar = (ovg) this.a;
                ovgVar.b = true;
                ovg.a();
                ovgVar.e.E((SparseArray) ovgVar.d);
                ieh.j().e(bwa.TOP_LEVEL_OPERATION, 10);
                bwg.d(view);
                return;
            case 19:
                ((cfz) this.a).u();
                return;
            default:
                ((cfz) this.a).g.e(cgd.PINNED_ACTION_CLICKED, cfz.r());
                return;
        }
    }
}
