package com.crispyecho.kotlingraphql.repository

import com.crispyecho.kotlingraphql.entity.Snack
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SnackRepository : MongoRepository<Snack, String>