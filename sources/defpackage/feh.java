package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: feh  reason: default package */
/* loaded from: classes.dex */
public final class feh implements gid {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerCallback");
    private final fev b;
    private final fds c;

    public feh(fev fevVar) {
        fds fdsVar = fds.a;
        this.b = fevVar;
        this.c = fdsVar;
        new ArrayList();
    }

    @Override // defpackage.gid
    public final void a(nlz nlzVar) {
        nlv nlvVar;
        nga<String> ngaVar;
        nlq nlqVar;
        if ((nlzVar.a & 2) != 0) {
            nly nlyVar = nlzVar.b;
            if (nlyVar == null) {
                nlyVar = nly.f;
            }
            int i = nlyVar.a;
            if (i == 1) {
                nly nlyVar2 = nlzVar.b;
                if (nlyVar2 == null) {
                    nlyVar2 = nly.f;
                }
                if (nlyVar2.a == 1) {
                    nlqVar = (nlq) nlyVar2.b;
                } else {
                    nlqVar = nlq.f;
                }
                ngaVar = nlqVar.b;
            } else {
                nly nlyVar3 = nlzVar.b;
                if (nlyVar3 == null) {
                    nlyVar3 = nly.f;
                }
                if (nlyVar3.a == 2) {
                    nlvVar = (nlv) nlyVar3.b;
                } else {
                    nlvVar = nlv.c;
                }
                ngaVar = nlvVar.a;
            }
            if (ngaVar.isEmpty()) {
                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerCallback", "handleSodaEvent", 69, "SodaRecognizerCallback.java")).t("Ignored a recognition event with no results.");
                return;
            }
            nfh t = bnq.b.t();
            if (i != 1) {
                ArrayList arrayList = new ArrayList();
                for (String str : ngaVar) {
                    if (!str.isEmpty()) {
                        nfh t2 = bns.f.t();
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        bns bnsVar = (bns) t2.b;
                        str.getClass();
                        int i2 = bnsVar.a | 1;
                        bnsVar.a = i2;
                        bnsVar.b = str;
                        bnsVar.a = i2 | 2;
                        bnsVar.c = false;
                        arrayList.add((bns) t2.cz());
                    }
                }
                t.cI(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                String str2 = !ngaVar.isEmpty() ? (String) ngaVar.get(0) : "";
                if (!str2.isEmpty()) {
                    nfh t3 = bns.f.t();
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    bns bnsVar2 = (bns) t3.b;
                    str2.getClass();
                    int i3 = bnsVar2.a | 1;
                    bnsVar2.a = i3;
                    bnsVar2.b = str2;
                    bnsVar2.a = i3 | 2;
                    bnsVar2.c = true;
                    arrayList2.add((bns) t3.cz());
                }
                t.cI(arrayList2);
            }
            if (((bnq) t.b).a.size() == 0) {
                return;
            }
            this.b.i((bnq) t.cz());
            fds fdsVar = this.c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (fdsVar.b > 0 && fdsVar.f < 0) {
                fdsVar.f = elapsedRealtime - fdsVar.b;
                fdsVar.l.g(fbp.ON_DEVICE_RECOGNIZER_FIRST_TEXT_RECEIVED_TIME, fdsVar.f);
                if (fdsVar.c > 0 && fdsVar.h < 0) {
                    fdsVar.h = elapsedRealtime - fdsVar.c;
                    fdsVar.l.g(fbp.ON_DEVICE_RECOGNIZER_SPEECH_START_TO_FIRST_TEXT_TIME, fdsVar.h);
                }
                if (fdsVar.d > 0 && fdsVar.k < 0) {
                    fdsVar.k = elapsedRealtime - fdsVar.d;
                    fdsVar.l.g(fbp.ON_DEVICE_RECOGNIZER_MIC_OPEN_TO_FIRST_TEXT_TIME, fdsVar.k);
                }
            }
        }
        if ((nlzVar.a & 8) != 0) {
            nlp nlpVar = nlzVar.c;
            if (nlpVar == null) {
                nlpVar = nlp.b;
            }
            int i4 = nlpVar.a;
            nlp nlpVar2 = nlzVar.c;
            if (nlpVar2 == null) {
                nlpVar2 = nlp.b;
            }
            int Z = ndb.Z(nlpVar2.a);
            if (Z == 0) {
                Z = 1;
            }
            int i5 = Z - 1;
            if (i5 == 0) {
                fds fdsVar2 = this.c;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                fdsVar2.m.c(elapsedRealtime2, few.ON_DEVICE);
                if (fdsVar2.b > 0 && fdsVar2.c < 0) {
                    fdsVar2.c = elapsedRealtime2;
                    fdsVar2.g = fdsVar2.c - fdsVar2.b;
                    fdsVar2.l.g(fbp.ON_DEVICE_RECOGNIZER_SPEECH_START_TIME, fdsVar2.g);
                }
                this.b.c();
            } else if (i5 == 1) {
                this.b.a();
            } else {
                ltd ltdVar = (ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerCallback", "handleSodaEvent", 100, "SodaRecognizerCallback.java");
                nlp nlpVar3 = nlzVar.c;
                if (nlpVar3 == null) {
                    nlpVar3 = nlp.b;
                }
                int Z2 = ndb.Z(nlpVar3.a);
                ltdVar.w("ignoring endpoint event: %s", (Z2 == 0 || Z2 == 1) ? "START_OF_SPEECH" : Z2 != 2 ? Z2 != 3 ? "END_OF_UTTERANCE" : "END_OF_AUDIO" : "END_OF_SPEECH");
            }
        }
        if ((nlzVar.a & 32) != 0) {
            nlo nloVar = nlzVar.e;
            if (nloVar == null) {
                nloVar = nlo.b;
            }
            this.b.d((int) (nloVar.a * 100.0f));
        }
    }
}
