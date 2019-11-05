class FavoriteGenre:

    def favGenre(self, numUsers, userBookListenedTo, numGenres, bookGenres):
        book_genre_dictionary = {}
        users_favGenre_dic = {}
      # here we are creating songs and genre dictionry
        for genre in bookGenres:
            for song in bookGenres[genre]:
                book_genre_dictionary[song] = genre
        
    # here we are creating user fav diction which has user and another dictionary with key as genre and value as its count
        for user in userBookListenedTo:
            songList = userBookListenedTo[user]
            if user  not in users_favGenre_dic:
                users_favGenre_dic[user] = {}
            for song in songList:
                if song in book_genre_dictionary and book_genre_dictionary[song] not in users_favGenre_dic[user]:
                    users_favGenre_dic[user][book_genre_dictionary[song]]=1
                if song in book_genre_dictionary:
                    users_favGenre_dic[user][book_genre_dictionary[song]]+=1

        # counting the genre and creating the list
        for user in users_favGenre_dic:
            maxCount=0
            for k,v in users_favGenre_dic[user].items():
                if v>maxCount:
                    maxCount=v
            genreCount = []
            for k,v in users_favGenre_dic[user].items():
                if v==maxCount:
                    genreCount.append(k)
            
            users_favGenre_dic[user] = genreCount 
        
        return genreCount





    
        




