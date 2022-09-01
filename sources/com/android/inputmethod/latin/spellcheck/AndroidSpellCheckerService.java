package com.android.inputmethod.latin.spellcheck;

import android.content.Context;
import android.service.textservice.SpellCheckerService;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.keyboard.client.delight5.LanguageIdentifier;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AndroidSpellCheckerService extends emu {
    private static final ltg h = ltg.j("com/android/inputmethod/latin/spellcheck/AndroidSpellCheckerService");
    public final asp a;
    private final enn i;
    private final hhk j;
    private final asl k;

    public AndroidSpellCheckerService() {
        asl aslVar = new asl();
        asp aspVar = new asp(ieh.j());
        enn ennVar = ((Boolean) enl.e.c()).booleanValue() ? new enn(ieh.j()) : null;
        this.j = new bvl(this, 1);
        this.a = aspVar;
        this.k = aslVar;
        this.i = ennVar;
    }

    @Override // defpackage.emu
    public final void a() {
        ((ltd) ((ltd) h.d()).k("com/android/inputmethod/latin/spellcheck/AndroidSpellCheckerService", "initialize", 82, "AndroidSpellCheckerService.java")).t("initialize...");
        this.b = new ems();
        Context applicationContext = getApplicationContext();
        ikj.C(applicationContext).s(this.b);
        if (((Boolean) enl.a.c()).booleanValue()) {
            this.c = new emr();
            gyk.i(applicationContext).s(this.c);
        }
        this.d = huk.a(applicationContext, ibz.e);
        huk hukVar = this.d;
        this.e = new emt(hukVar);
        hukVar.g(this.e);
        this.f = true;
        cbd cbdVar = cbd.c;
        Field[] fields = bor.class.getFields();
        if (!cbdVar.g.getAndSet(true)) {
            for (Field field : fields) {
                try {
                    if ("metadata".equals(field.getName())) {
                        cbdVar.d = field.getInt(field);
                    } else {
                        Matcher matcher = cbd.b.matcher(field.getName());
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            String group3 = matcher.group(3);
                            if (!TextUtils.isEmpty(group)) {
                                field.getName();
                                cbdVar.e.put(jaz.b(group, group2), cbc.a(Integer.valueOf(field.getInt(field)), Integer.valueOf(group3)));
                            }
                        }
                    }
                } catch (IllegalAccessException e) {
                    ((ltd) ((ltd) cbd.a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils", "setExternalRawResources", 402, "FileLocationUtils.java")).t("setExternalRawResources()");
                }
            }
            cbdVar.f.countDown();
        }
        Delight5Facilitator.h(getApplicationContext());
        enn ennVar = this.i;
        if (ennVar != null) {
            ennVar.d = eoh.b(getApplicationContext());
            ennVar.g = icu.k(new ehz(ennVar, 6), ennVar.c);
        }
        this.k.f(gyc.b);
        if (((Boolean) iqt.b.c()).booleanValue()) {
            gyc gycVar = gyc.b;
            asp aspVar = this.a;
            Objects.requireNonNull(aspVar);
            gycVar.execute(new att(aspVar, 1));
        }
        iqt.b.e(this.j);
        ((ltd) ((ltd) h.d()).k("com/android/inputmethod/latin/spellcheck/AndroidSpellCheckerService", "initialize", 94, "AndroidSpellCheckerService.java")).t("initialize...done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [emx] */
    @Override // android.service.textservice.SpellCheckerService
    public final SpellCheckerService.Session createSession() {
        emz emzVar;
        if (this.f) {
            asl aslVar = this.k;
            ArrayList arrayList = new ArrayList();
            if (((Boolean) eng.c.c()).booleanValue()) {
                arrayList.add(new ena(ieh.j()));
            }
            if (((Boolean) eng.f.c()).booleanValue()) {
                arrayList.add(new emy(new LanguageIdentifier(getApplicationContext()), ieh.j()));
            }
            LanguageIdentifier languageIdentifier = null;
            if (arrayList.isEmpty()) {
                emzVar = null;
            } else {
                emzVar = arrayList.size() == 1 ? (emx) arrayList.get(0) : new emz(arrayList);
            }
            if (((Boolean) enl.d.c()).booleanValue()) {
                languageIdentifier = new LanguageIdentifier(getApplicationContext());
            }
            return new enj(aslVar, emzVar, languageIdentifier, this.i, ieh.j(), getApplicationContext());
        }
        return new asq();
    }

    @Override // defpackage.emu, android.app.Service
    public final void onDestroy() {
        if (this.f) {
            this.k.h();
            enn ennVar = this.i;
            if (ennVar != null) {
                hzr hzrVar = ennVar.g;
                if (hzrVar != null) {
                    hzrVar.e();
                }
                ennVar.f.acquireUninterruptibly();
                ennVar.a();
                ennVar.f.release();
            }
            gyc gycVar = gyc.b;
            asp aspVar = this.a;
            Objects.requireNonNull(aspVar);
            gycVar.execute(new od(aspVar, 20));
            iqt.b.g(this.j);
        }
        super.onDestroy();
    }
}
