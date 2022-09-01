package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mbi  reason: default package */
/* loaded from: classes.dex */
public enum mbi implements nfp {
    UNDEFINED(0),
    ACTIVATE(1),
    OPEN_FULL_SCREEN(2),
    OPEN_HALF_SCREEN(3),
    DRAW_STROKE(4),
    SPACE(6),
    ENTER(8),
    DELETE(10),
    CANDIDATE_DELETE(11),
    SELECT_FIRST_CANDIDATE(12),
    SELECT_OTHER_CANDIDATE(13),
    RECOGNIZER_INIT_SUCCEED(14),
    RECOGNIZER_INIT_FAILED(15),
    CONFIRM_WRITE(5),
    CONFIRM_SPACE(7),
    CONFIRM_ENTER(9),
    CONFIRM_CLOSE(16),
    CONFIRM_PLACE_CURSOR(17),
    SELECT_FIRST_CANDIDATE_NEXT_WORD_PREDICTION(18),
    SELECT_OTHER_CANDIDATE_NEXT_WORD_PREDICTION(19),
    SELECT_FIRST_CANDIDATE_SPELLING_CORRECTION(20),
    SELECT_OTHER_CANDIDATE_SPELLING_CORRECTION(21);
    
    public final int w;

    mbi(int i) {
        this.w = i;
    }

    public static mbi b(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return ACTIVATE;
            case 2:
                return OPEN_FULL_SCREEN;
            case 3:
                return OPEN_HALF_SCREEN;
            case 4:
                return DRAW_STROKE;
            case 5:
                return CONFIRM_WRITE;
            case 6:
                return SPACE;
            case 7:
                return CONFIRM_SPACE;
            case 8:
                return ENTER;
            case 9:
                return CONFIRM_ENTER;
            case 10:
                return DELETE;
            case 11:
                return CANDIDATE_DELETE;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return SELECT_FIRST_CANDIDATE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return SELECT_OTHER_CANDIDATE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return RECOGNIZER_INIT_SUCCEED;
            case 15:
                return RECOGNIZER_INIT_FAILED;
            case 16:
                return CONFIRM_CLOSE;
            case 17:
                return CONFIRM_PLACE_CURSOR;
            case 18:
                return SELECT_FIRST_CANDIDATE_NEXT_WORD_PREDICTION;
            case 19:
                return SELECT_OTHER_CANDIDATE_NEXT_WORD_PREDICTION;
            case 20:
                return SELECT_FIRST_CANDIDATE_SPELLING_CORRECTION;
            case 21:
                return SELECT_OTHER_CANDIDATE_SPELLING_CORRECTION;
            default:
                return null;
        }
    }

    public static nfq c() {
        return maw.u;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
