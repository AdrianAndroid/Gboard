package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: dow  reason: default package */
/* loaded from: classes.dex */
public final class dow implements dfq {
    private dfr c;
    private boolean d;
    private List e;
    private List f;
    private static final iah[] b = {iah.PRESS, iah.DOUBLE_TAP, iah.LONG_PRESS};
    static final hhl a = hhq.a("populate_bksp_enter_info", false);

    @Override // defpackage.dfq
    public final void a(SoftKeyView softKeyView, dfr dfrVar, List list, List list2) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        this.c = dfrVar;
        this.e = list;
        this.f = list2;
        iah[] iahVarArr = b;
        int length = iahVarArr.length;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= 3) {
                z = false;
                break;
            } else if (softKeyView.c(iahVarArr[i4]) != null && (i5 = i5 + 1) > 1) {
                z = true;
                break;
            } else {
                i4++;
            }
        }
        this.d = z;
        iah[] iahVarArr2 = b;
        int length2 = iahVarArr2.length;
        int i6 = 0;
        for (i = 3; i6 < i; i = 3) {
            ial c = softKeyView.c(iahVarArr2[i6]);
            if (c != null) {
                iay[] iayVarArr = c.d;
                int length3 = iayVarArr.length;
                int i7 = 0;
                while (i7 < length3) {
                    iay iayVar = iayVarArr[i7];
                    iah iahVar = c.c;
                    if (iayVar != null) {
                        if (iayVar.e != null || iayVar.c != 59) {
                            if (iahVar == iah.PRESS) {
                                int i8 = iayVar.c;
                                if (i8 != -10011 && i8 != -10030) {
                                    if (i8 == -10058) {
                                        i8 = -10058;
                                    }
                                }
                                dfr dfrVar2 = this.c;
                                dfrVar2.f = i8;
                                dfrVar2.g = "";
                                dfrVar2.h = z3;
                                this.e.add(dfrVar2.a());
                            }
                            iah iahVar2 = iah.PRESS;
                            if (iahVar == iahVar2 && iayVar.c == 67) {
                                dfr dfrVar3 = this.c;
                                dfrVar3.f = 8;
                                dfrVar3.g = "";
                                dfrVar3.h = true;
                                if (((Boolean) a.c()).booleanValue()) {
                                    this.e.add(this.c.a());
                                }
                                this.f.add(this.c.a());
                            } else if (iahVar == iahVar2 && ((i3 = iayVar.c) == 66 || i3 == -10018)) {
                                dfr dfrVar4 = this.c;
                                dfrVar4.f = 10;
                                dfrVar4.g = "";
                                dfrVar4.h = true;
                                if (((Boolean) a.c()).booleanValue()) {
                                    this.e.add(this.c.a());
                                }
                                if (iayVar.c == -10018) {
                                    this.c.f = -10018;
                                }
                                this.f.add(this.c.a());
                            } else if (iahVar != iahVar2 || iayVar.c != -10012) {
                                if ((iayVar.e instanceof String) && ((i2 = iayVar.c) > 0 || iaz.i(i2))) {
                                    String str = (String) iayVar.e;
                                    if (!TextUtils.isEmpty(str)) {
                                        this.c.f = str.codePointAt(0);
                                        dfr dfrVar5 = this.c;
                                        dfrVar5.g = str;
                                        int i9 = iayVar.c;
                                        if (i9 < 7 || i9 > 16) {
                                            if (this.d && iahVar != b[0]) {
                                                z2 = true;
                                                dfrVar5.h = z2;
                                            }
                                            z2 = false;
                                            dfrVar5.h = z2;
                                        }
                                        this.e.add(dfrVar5.a());
                                        i7++;
                                        z3 = false;
                                    }
                                }
                            } else {
                                dfr dfrVar6 = this.c;
                                dfrVar6.f = -10012;
                                dfrVar6.g = "";
                                dfrVar6.h = true;
                                this.e.add(dfrVar6.a());
                                this.f.add(this.c.a());
                            }
                        } else {
                            dfr dfrVar7 = this.c;
                            dfrVar7.f = -10032;
                            dfrVar7.g = "";
                            dfrVar7.h = z3;
                            this.e.add(dfrVar7.a());
                        }
                    }
                    i7++;
                    z3 = false;
                }
            }
            i6++;
            z3 = false;
        }
    }
}
