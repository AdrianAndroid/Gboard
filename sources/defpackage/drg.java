package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: drg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class drg implements dro {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ drg(dqv dqvVar, int i) {
        this.b = i;
        this.a = dqvVar;
    }

    public /* synthetic */ drg(dri driVar, int i) {
        this.b = i;
        this.a = driVar;
    }

    @Override // defpackage.dro
    public final void a(File file) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            File a = dri.a(file, "mozcdata-");
            if (a == null) {
                return;
            }
            dri driVar = (dri) obj;
            File file2 = new File(driVar.b.getFilesDir(), "mozc_downloaded.data");
            dsn n = dsn.n(driVar.b, dso.a);
            nfh t = ggv.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggv ggvVar = (ggv) t.b;
            ggvVar.b = 1;
            ggvVar.a |= 1;
            String absolutePath = a.getAbsolutePath();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggv ggvVar2 = (ggv) t.b;
            absolutePath.getClass();
            ggvVar2.a |= 2;
            ggvVar2.c = absolutePath;
            String absolutePath2 = file2.getAbsolutePath();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggv ggvVar3 = (ggv) t.b;
            absolutePath2.getClass();
            ggvVar3.a |= 4;
            ggvVar3.d = absolutePath2;
            ggv ggvVar4 = (ggv) t.cz();
            nfh t2 = ggh.o.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ggh gghVar = (ggh) t2.b;
            gghVar.b = 27;
            int i2 = 1 | gghVar.a;
            gghVar.a = i2;
            ggvVar4.getClass();
            gghVar.m = ggvVar4;
            gghVar.a = i2 | 4096;
            n.f((ggh) t2.cz(), null, null);
            ((luc) ((luc) dri.a.b()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcInputMethodEntryActivationContentObserver", "onSuperpacksJapaneseLanguageModelLoadSuccess", 167, "MozcInputMethodEntryActivationContentObserver.java")).G("mozc data file downloaded and installed. path = %s, install_file = %s", a, file2);
            ino.M(driVar.b).h("mozc_dictionary_version", ((Long) dqq.e.c()).intValue());
        } else if (i == 1) {
            Object obj2 = this.a;
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length != 1) {
                return;
            }
            try {
                ((dqv) obj2).b(new FileInputStream(listFiles[0]));
            } catch (FileNotFoundException e) {
                ((luc) ((luc) ((luc) dqv.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/mozc/ime/CandidateDescriptionGenerator", "lambda$loadCandidateDescriptionDataFromSuperpacksAsync$1", 165, "CandidateDescriptionGenerator.java")).w("File is not found: %s", listFiles[0].getName());
            }
        } else {
            Object obj3 = this.a;
            File a2 = dri.a(file, "mozcspellcheckerdata-");
            if (a2 == null) {
                return;
            }
            dri driVar2 = (dri) obj3;
            File file3 = new File(driVar2.b.getFilesDir(), "mozc_spellchecker_downloaded.data");
            dsn n2 = dsn.n(driVar2.b, dso.a);
            nfh t3 = ggv.e.t();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            ggv ggvVar5 = (ggv) t3.b;
            ggvVar5.b = 1;
            ggvVar5.a |= 1;
            String absolutePath3 = a2.getAbsolutePath();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            ggv ggvVar6 = (ggv) t3.b;
            absolutePath3.getClass();
            ggvVar6.a |= 2;
            ggvVar6.c = absolutePath3;
            String absolutePath4 = file3.getAbsolutePath();
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            ggv ggvVar7 = (ggv) t3.b;
            absolutePath4.getClass();
            ggvVar7.a |= 4;
            ggvVar7.d = absolutePath4;
            ggv ggvVar8 = (ggv) t3.cz();
            nfh t4 = ggh.o.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            ggh gghVar2 = (ggh) t4.b;
            gghVar2.b = 29;
            int i3 = 1 | gghVar2.a;
            gghVar2.a = i3;
            ggvVar8.getClass();
            gghVar2.m = ggvVar8;
            gghVar2.a = i3 | 4096;
            n2.f((ggh) t4.cz(), null, null);
            ((luc) ((luc) dri.a.b()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcInputMethodEntryActivationContentObserver", "onSuperpacksSpellCheckerModelLoadSuccess", 192, "MozcInputMethodEntryActivationContentObserver.java")).G("mozc spellchecker data file downloaded and installed. path = %s install_file = %s", a2, file3);
        }
    }
}
