package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dxv  reason: default package */
/* loaded from: classes.dex */
public final class dxv extends dkl {
    private static dxv e;
    private final Context f;
    private static final String[] d = {"qwerty_without_english_setting_scheme", "qwerty_with_english_setting_scheme", "9key_without_english_setting_scheme", "9key_with_english_setting_scheme"};
    protected static final String[] c = {"", "zh_t_i0_shuangpin_abc_android_token_id_table", "zh_t_i0_shuangpin_flypy_android_token_id_table", "zh_t_i0_shuangpin_jiajia_android_token_id_table", "zh_t_i0_shuangpin_ms_android_token_id_table", "zh_t_i0_shuangpin_ziguang_android_token_id_table", "zh_t_i0_shuangpin_ziranma_android_token_id_table"};

    protected dxv(Context context) {
        super(dxu.l(context));
        this.f = context.getApplicationContext();
    }

    public static dxv h(Context context) {
        dxv dxvVar;
        synchronized (dxv.class) {
            if (e == null) {
                e = new dxv(context);
                div.c().i(e, "zh_CN", "zh_CN");
            }
            dxvVar = e;
        }
        return dxvVar;
    }

    @Override // defpackage.dkl
    protected final String d() {
        return "gesture_data_scheme";
    }

    @Override // defpackage.dkl
    protected final boolean e(String str) {
        return this.a.an(str, R.string.f161250_resource_name_obfuscated_res_0x7f14069d) || this.a.an(str, R.string.f162290_resource_name_obfuscated_res_0x7f140706);
    }

    @Override // defpackage.dkl
    protected final String[] f() {
        return d;
    }

    @Override // defpackage.dkl
    protected final void g(String str, nfh nfhVar) {
        int i;
        String y = this.a.y(R.string.f162290_resource_name_obfuscated_res_0x7f140706);
        if (!TextUtils.isEmpty(y)) {
            int length = dxu.a.length;
            i = 0;
            while (i < 7) {
                if (y.equals(this.f.getString(dxu.a[i]))) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        int i2 = 2;
        if (i != 0) {
            mpe mpeVar = ((mpo) nfhVar.b).h;
            if (mpeVar == null) {
                mpeVar = mpe.b;
            }
            nfh nfhVar2 = (nfh) mpeVar.N(5);
            nfhVar2.cG(mpeVar);
            int i3 = 0;
            while (i3 < ((mpe) nfhVar2.b).a.size()) {
                mpc dq = nfhVar2.dq(i3);
                if (dq.b.equals("zh_pinyin")) {
                    nfh nfhVar3 = (nfh) dq.N(5);
                    nfhVar3.cG(dq);
                    if (i != 0 && (str.equals("zh_pinyin_9key_with_english") || str.equals("zh_pinyin_9key_without_english"))) {
                        mvv mvvVar = dq.c;
                        if (mvvVar == null) {
                            mvvVar = mvv.c;
                        }
                        mvw mvwVar = mvvVar.b;
                        if (mvwVar == null) {
                            mvwVar = mvw.c;
                        }
                        nfh nfhVar4 = (nfh) mvwVar.N(5);
                        nfhVar4.cG(mvwVar);
                        if (nfhVar4.c) {
                            nfhVar4.cD();
                            nfhVar4.c = false;
                        }
                        mvw mvwVar2 = (mvw) nfhVar4.b;
                        mvwVar2.a |= 32768;
                        mvwVar2.b = -5.0f;
                        mvw mvwVar3 = (mvw) nfhVar4.cz();
                        mvv mvvVar2 = dq.c;
                        if (mvvVar2 == null) {
                            mvvVar2 = mvv.c;
                        }
                        nfh nfhVar5 = (nfh) mvvVar2.N(5);
                        nfhVar5.cG(mvvVar2);
                        if (nfhVar5.c) {
                            nfhVar5.cD();
                            nfhVar5.c = false;
                        }
                        mvv mvvVar3 = (mvv) nfhVar5.b;
                        mvwVar3.getClass();
                        mvvVar3.b = mvwVar3;
                        mvvVar3.a |= 512;
                        if (nfhVar3.c) {
                            nfhVar3.cD();
                            nfhVar3.c = false;
                        }
                        mpc mpcVar = (mpc) nfhVar3.b;
                        mvv mvvVar4 = (mvv) nfhVar5.cz();
                        mvvVar4.getClass();
                        mpcVar.c = mvvVar4;
                        mpcVar.a |= i2;
                    }
                    for (int i4 = 0; i4 < dq.d.size(); i4++) {
                        int g = msc.g(((mpb) dq.d.get(i4)).b);
                        if (g == 0) {
                            g = 1;
                        }
                        if (g - 1 == 0) {
                            mpb mpbVar = (mpb) dq.d.get(i4);
                            nfh nfhVar6 = (nfh) mpbVar.N(5);
                            nfhVar6.cG(mpbVar);
                            String str2 = dxu.b[i];
                            if (nfhVar6.c) {
                                nfhVar6.cD();
                                nfhVar6.c = false;
                            }
                            mpb mpbVar2 = (mpb) nfhVar6.b;
                            str2.getClass();
                            mpbVar2.a |= 4;
                            mpbVar2.c = str2;
                            nfhVar3.dP(i4, nfhVar6);
                        } else {
                            mpb mpbVar3 = (mpb) dq.d.get(i4);
                            nfh nfhVar7 = (nfh) mpbVar3.N(5);
                            nfhVar7.cG(mpbVar3);
                            String str3 = c[i];
                            if (nfhVar7.c) {
                                nfhVar7.cD();
                                nfhVar7.c = false;
                            }
                            mpb mpbVar4 = (mpb) nfhVar7.b;
                            str3.getClass();
                            mpbVar4.a |= 8;
                            mpbVar4.d = str3;
                            nfhVar3.dP(i4, nfhVar7);
                        }
                    }
                    nfhVar2.dO(i3, nfhVar3);
                }
                i3++;
                i2 = 2;
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar = (mpo) nfhVar.b;
            mpe mpeVar2 = (mpe) nfhVar2.cz();
            mpeVar2.getClass();
            mpoVar.h = mpeVar2;
            mpoVar.a |= 16384;
        } else {
            i = 0;
        }
        if (this.a.aj(R.string.f161250_resource_name_obfuscated_res_0x7f14069d)) {
            mpe mpeVar3 = ((mpo) nfhVar.b).h;
            if (mpeVar3 == null) {
                mpeVar3 = mpe.b;
            }
            nfh nfhVar8 = (nfh) mpeVar3.N(5);
            nfhVar8.cG(mpeVar3);
            for (int i5 = 0; i5 < ((mpe) nfhVar8.b).a.size(); i5++) {
                mpc dq2 = nfhVar8.dq(i5);
                if (dq2.b.equals("zh_pinyin")) {
                    for (int i6 = 0; i6 < dq2.d.size(); i6++) {
                        int g2 = msc.g(((mpb) dq2.d.get(i6)).b);
                        if (g2 != 0 && g2 == 2) {
                            mpb mpbVar5 = (mpb) dq2.d.get(i6);
                            nfh nfhVar9 = (nfh) mpbVar5.N(5);
                            nfhVar9.cG(mpbVar5);
                            nfh t = mpd.d.t();
                            String str4 = dxu.b[i];
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            mpd mpdVar = (mpd) t.b;
                            str4.getClass();
                            int i7 = mpdVar.a | 1;
                            mpdVar.a = i7;
                            mpdVar.b = str4;
                            mpdVar.a = i7 | 2;
                            mpdVar.c = "zh-t-i0-pinyin-x-f0-delight";
                            if (nfhVar9.c) {
                                nfhVar9.cD();
                                nfhVar9.c = false;
                            }
                            mpb mpbVar6 = (mpb) nfhVar9.b;
                            mpd mpdVar2 = (mpd) t.cz();
                            mpdVar2.getClass();
                            mpbVar6.e = mpdVar2;
                            mpbVar6.a |= 16;
                            mpb mpbVar7 = (mpb) nfhVar9.cz();
                            nfh nfhVar10 = (nfh) dq2.N(5);
                            nfhVar10.cG(dq2);
                            if (nfhVar10.c) {
                                nfhVar10.cD();
                                nfhVar10.c = false;
                            }
                            mpc mpcVar2 = (mpc) nfhVar10.b;
                            mpbVar7.getClass();
                            mpcVar2.b();
                            mpcVar2.d.set(i6, mpbVar7);
                            nfhVar8.dO(i5, nfhVar10);
                        }
                    }
                }
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            mpo mpoVar2 = (mpo) nfhVar.b;
            mpe mpeVar4 = (mpe) nfhVar8.cz();
            mpeVar4.getClass();
            mpoVar2.h = mpeVar4;
            mpoVar2.a |= 16384;
        }
    }
}
