package defpackage;

import android.app.backup.BackupManager;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.framework.core.AppBase;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler;
import com.google.android.apps.inputmethod.libs.korean.KoreanGestureMotionEventHandler;
import com.google.android.apps.inputmethod.libs.pinyin.PinyinGestureHandler;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: btf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class btf implements inm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ btf(bqh bqhVar, int i) {
        this.b = i;
        this.a = bqhVar;
    }

    public /* synthetic */ btf(btg btgVar, int i) {
        this.b = i;
        this.a = btgVar;
    }

    public /* synthetic */ btf(bvp bvpVar, int i) {
        this.b = i;
        this.a = bvpVar;
    }

    public btf(bxm bxmVar, int i) {
        this.b = i;
        this.a = bxmVar;
    }

    public /* synthetic */ btf(AppBase appBase, int i) {
        this.b = i;
        this.a = appBase;
    }

    public /* synthetic */ btf(HandwritingMotionEventHandler handwritingMotionEventHandler, int i) {
        this.b = i;
        this.a = handwritingMotionEventHandler;
    }

    public /* synthetic */ btf(KoreanGestureMotionEventHandler koreanGestureMotionEventHandler, int i) {
        this.b = i;
        this.a = koreanGestureMotionEventHandler;
    }

    public /* synthetic */ btf(PinyinGestureHandler pinyinGestureHandler, int i) {
        this.b = i;
        this.a = pinyinGestureHandler;
    }

    public /* synthetic */ btf(cti ctiVar, int i) {
        this.b = i;
        this.a = ctiVar;
    }

    public /* synthetic */ btf(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    public /* synthetic */ btf(dij dijVar, int i) {
        this.b = i;
        this.a = dijVar;
    }

    public /* synthetic */ btf(dxu dxuVar, int i) {
        this.b = i;
        this.a = dxuVar;
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        File r;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((btg) obj).a = inoVar.y(R.string.f160460_resource_name_obfuscated_res_0x7f14064b);
                dij dijVar = (dij) obj;
                dijVar.E();
                dijVar.v();
                dijVar.y();
                return;
            case 1:
                ((bqh) this.a).c(inoVar);
                return;
            case 2:
                Object obj2 = this.a;
                ((btg) obj2).b = inoVar.aj(R.string.f160490_resource_name_obfuscated_res_0x7f14064e);
                dij dijVar2 = (dij) obj2;
                dijVar2.E();
                dijVar2.y();
                return;
            case 3:
                Object obj3 = this.a;
                ((btg) obj3).c = inoVar.aj(R.string.f161380_resource_name_obfuscated_res_0x7f1406aa);
                dij dijVar3 = (dij) obj3;
                dijVar3.E();
                dijVar3.y();
                return;
            case 4:
                ((bvp) this.a).o();
                return;
            case 5:
                ((bvp) this.a).n();
                return;
            case 6:
                lmz lmzVar = bxm.a;
                if (!TextUtils.equals(str, ((bxm) this.a).f.getString(R.string.f160750_resource_name_obfuscated_res_0x7f14066b))) {
                    return;
                }
                if (!inoVar.aj(R.string.f160750_resource_name_obfuscated_res_0x7f14066b)) {
                    ((bxm) this.a).g.g(mqc.CONCEPT_PRED);
                    ((bxm) this.a).g.g(mqc.TRANSFORMER_EXPRESSION_PRED);
                }
                ((bxm) this.a).g.d();
                return;
            case 7:
                ((cti) this.a).a.set(inoVar.aj(ieh.d));
                return;
            case 8:
                Object obj4 = this.a;
                ieh.j().e(dda.SHARED_PREFERENCE_CHANGED, str);
                BackupManager backupManager = ((AppBase) obj4).f;
                if (backupManager == null) {
                    return;
                }
                backupManager.dataChanged();
                return;
            case 9:
                ((dcu) this.a).O.set(true);
                return;
            case 10:
                ((HandwritingMotionEventHandler) this.a).s();
                return;
            case 11:
                ((HandwritingMotionEventHandler) this.a).q();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((HandwritingMotionEventHandler) this.a).r();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj5 = this.a;
                if (inoVar.an(str, R.string.f160330_resource_name_obfuscated_res_0x7f14063e)) {
                    return;
                }
                int i = 0;
                while (true) {
                    int[] iArr = dij.g;
                    if (i >= 4) {
                        i = -1;
                    } else if (!inoVar.an(str, iArr[i])) {
                        i++;
                    }
                }
                if (i == -1) {
                    ((ltd) dij.f.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmm/AbstractHmmEngineFactory", "checkAndRefreshMutableDictionaryDataSetting", 893, "AbstractHmmEngineFactory.java")).w("Failed to find the right enroll dictionary perf key for: %s", str);
                    return;
                }
                boolean ak = inoVar.ak(str);
                dij dijVar4 = (dij) obj5;
                boolean[] zArr = dijVar4.i;
                if (zArr[i] == ak) {
                    return;
                }
                zArr[i] = ak;
                if (!ak) {
                    if (dip.b()[i] == 3) {
                        djn.c(dijVar4, false);
                    } else {
                        String H = dijVar4.H(dip.b()[i]);
                        if (H != null && (r = dijVar4.r(H)) != null) {
                            r.delete();
                        }
                    }
                }
                dijVar4.E();
                dijVar4.I(dip.b()[i]);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((KoreanGestureMotionEventHandler) this.a).t(inoVar);
                return;
            case 15:
                ((PinyinGestureHandler) this.a).t(inoVar);
                return;
            case 16:
                Object obj6 = this.a;
                ((dxu) obj6).c = inoVar.aj(R.string.f161250_resource_name_obfuscated_res_0x7f14069d);
                dij dijVar5 = (dij) obj6;
                dijVar5.E();
                dijVar5.y();
                return;
            case 17:
                Object obj7 = this.a;
                ((dxu) obj7).o = inoVar.aj(R.string.f160480_resource_name_obfuscated_res_0x7f14064d);
                dij dijVar6 = (dij) obj7;
                dijVar6.E();
                dijVar6.y();
                return;
            case 18:
                Object obj8 = this.a;
                ((dxu) obj8).p = inoVar.aj(R.string.f160470_resource_name_obfuscated_res_0x7f14064c);
                dij dijVar7 = (dij) obj8;
                dijVar7.E();
                dijVar7.y();
                return;
            case 19:
                Object obj9 = this.a;
                dxu dxuVar = (dxu) obj9;
                dxuVar.d = dxuVar.m();
                dxuVar.n();
                dij dijVar8 = (dij) obj9;
                dijVar8.E();
                dijVar8.y();
                return;
            default:
                Object obj10 = this.a;
                ((dxu) obj10).q = inoVar.aj(R.string.f162600_resource_name_obfuscated_res_0x7f140725);
                dij dijVar9 = (dij) obj10;
                dijVar9.E();
                dijVar9.y();
                return;
        }
    }
}
